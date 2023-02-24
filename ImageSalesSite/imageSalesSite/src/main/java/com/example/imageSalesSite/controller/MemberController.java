package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.dto.CodeLabelValue;
import com.example.imageSalesSite.service.CodeService;
import com.example.imageSalesSite.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/user")
public class MemberController {

    private final MemberService service;

    // 회원 직업 코드 목록을 가져오기 위한 CodeService 구현 객체 주입
    private final CodeService codeService;

    // 스프링 시큐리티의 비밀번호 암호 처리기
    private final PasswordEncoder passwordEncoder;

    // 회원 테이블에 데이터가 없으면 최초 관리자를 생성한다.
    @PostMapping(value = "/setup")
    public String setupAdming(@Validated Member member, BindingResult result, RedirectAttributes rttr) throws Exception {
        if (result.hasErrors()) {
            return "user/setup";
        }

        // 회원 테이블 데이터 건수를 확인하여 빈 테이블이면 최초 관리자를 생성한다.
        if(service.countAll() == 0) {
            String inputPassword = member.getUserPw();
            member.setUserPw(passwordEncoder.encode(inputPassword));

            member.setJob("00");

            service.setupAdmin(member);

            rttr.addFlashAttribute("userName", member.getUserName());
            return "redirect:/user/registerSuccess";
        }

        // 회원 테이블에 데이터가 존재하면 최초 관리자를 생성할 수 없으므로 실패 화면으로 이동
        return "redirect:/user/setupFailure";

    }

    // 최초 관리자를 생성하는 화면을 반환한다.
    @GetMapping(value = "/setup")
    public String setupAdminForm(Member member, Model model) throws Exception {

        // 회원 테이블 데이터 건수 확인하여 최초관리자 등록화면 표시
        if(service.countAll() == 0) {
            return "user/setup";
        }

        // 회원 테이블에 데이터가 존재하면 최초 관리자를 생성할 수 없으므로 실패 화면으로 이동
        return "redirect:/user/setupFailure";
    }

    // 등록 성공 화면
    @GetMapping(value = "/registerSuccess")
    public void registerSuccess(Model model) throws Exception {
    }

    // 등록 화면
    @GetMapping(value = "/register")
    public void registerForm(Member member, Model model) throws Exception {

        // 직업코드 목록을 조회하여 뷰에 전달
        String groupCode = "A01";
        List<CodeLabelValue> jobList = codeService.getCodeList(groupCode);

        model.addAttribute("jobList", jobList);

    }

    // 등록 처리
    @PostMapping(value = "/register")
    public String register(@Validated Member member, BindingResult result, Model model, RedirectAttributes rttr) throws Exception {

        if(result.hasErrors()) {

            // 직업 코드 목록을 조회하여 뷰에 전달
            String groupCode = "A01";
            List<CodeLabelValue>jobList = codeService.getCodeList(groupCode);

            model.addAttribute("jobList", jobList);

            return "user/register";

        }

        // 비밀번호 암호화
        String inputPassword = member.getUserPw();
        member.setUserPw(passwordEncoder.encode(inputPassword));

        service.register(member);

        rttr.addFlashAttribute("userName", member.getUserName());

        return "redirect:/user/registerSuccess";
    }

    // 목록 화면
    @GetMapping(value = "/list")
    public void list(Model model) throws Exception {
        model.addAttribute("list", service.list());
    }

    // 상세 화면
    @GetMapping(value = "/read")
    public void read(Long userNo, Model model) throws Exception {

        // 작업 코드 목록을 조회하여 뷰에 전달
        String groupCode = "A01";
        List<CodeLabelValue>jobList = codeService.getCodeList(groupCode);

        model.addAttribute("jobList", jobList);

        model.addAttribute(service.read(userNo));
    }

    // 삭제 처리
    @PostMapping(value = "/remove")
    public String remove(Long userNo, RedirectAttributes rttr) throws Exception {

        service.remove(userNo);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/user/list";
    }

    // 수정 화면
    @GetMapping(value = "/modify")
    public void modifyForm(Long userNo, Model model) throws Exception {

        String groupCode = "A01";
        List<CodeLabelValue> jobList = codeService.getCodeList(groupCode);

        model.addAttribute("joblist", jobList);

        model.addAttribute(service.read(userNo));
    }

    // 수정 처리
    @PostMapping(value = "/modify")
    public String modify(Member member, RedirectAttributes rttr) throws Exception {

        service.modify(member);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/user/list";
    }

}
