package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.domain.Member;
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

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/user")
public class MemberController {

    private final MemberService service;

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

}
