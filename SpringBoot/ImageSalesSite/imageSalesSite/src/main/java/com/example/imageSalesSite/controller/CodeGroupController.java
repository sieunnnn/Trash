package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.domain.CodeGroup;
import com.example.imageSalesSite.service.CodeGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping(value = "/codegroup")
// 관리자 권한을 가진 사용자만 접근이 가능
@PreAuthorize("hasRole('ADMIN')")
public class CodeGroupController {

    private final CodeGroupService service;

    // 등록 화면
    @GetMapping(value = "/register")
    public void registerForm(Model model) throws Exception {
        CodeGroup codeGroup = new CodeGroup();
        model.addAttribute(codeGroup);
    }

    // 등록 처리
    @PostMapping(value = "/register")
    // 유효성 검증 처리
    public String register(@Validated CodeGroup codeGroup, BindingResult result, RedirectAttributes rttr) throws Exception {

        // 등록 처리시 유효성 검증 에러가 발생 하면 등록 화면 으로 forwarding
        if(result.hasErrors()) {
            return "codegroup/register";
        }

        service.register(codeGroup);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/codegroup/list";
    }

    // 목록 화면
    @GetMapping(value = "/list")
    public void list(Model model) throws Exception {
        model.addAttribute("list", service.list());
    }

    // 상세 화면
    @GetMapping(value = "/read")
    public void read(String groupCode, Model model) throws Exception {
        model.addAttribute(service.read(groupCode));
    }

    // 수정 화면
    @GetMapping(value = "/modify")
    public void modifyForm(String groupCode, Model model) throws Exception {
        model.addAttribute(service.read(groupCode));
    }

    // 수정 처리
    @PostMapping(value = "/modify")
    // 유효성 검증 처리
    public String modify(@Validated CodeGroup codeGroup, BindingResult result, RedirectAttributes rttr) throws Exception {

        // 수정 처리시 유효성 검증 에러가 발생하면 수정화면으로 forwarding
        if(result.hasErrors()) {
            return "codegroup/modify";
        }

        service.modify(codeGroup);
        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codegroup/list";
    }

    // 삭제 처리
    @PostMapping(value = "/remove")
    public String remove(String groupCode, RedirectAttributes rttr) throws Exception {

        service.remove(groupCode);
        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codegroup/list";
    }
}
