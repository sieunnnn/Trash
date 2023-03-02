package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.domain.CodeDetail;
import com.example.imageSalesSite.dto.CodeLabelValue;
import com.example.imageSalesSite.service.CodeDetailService;
import com.example.imageSalesSite.service.CodeService;
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

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/codedetail")
@PreAuthorize("hasRole('ADMIN')")
public class CodeDetailController {

    private final CodeDetailService codeDetailService;

    private final CodeService codeService;

    @GetMapping(value = "/register")
    public void registerForm(Model model) throws Exception {
        CodeDetail codeDetail = new CodeDetail();
        model.addAttribute(codeDetail);

        List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
        model.addAttribute("groupCodeList", groupCodeList);
    }

    @PostMapping(value = "/register")
    public String register(CodeDetail codeDetail, RedirectAttributes rttr) throws Exception {
        codeDetailService.register(codeDetail);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/codedetail/list";
    }

    @GetMapping(value = "/list")
    public void list(Model model) throws Exception {
        model.addAttribute("list", codeDetailService.list());
    }

    @GetMapping(value = "/read")
    public void read(CodeDetail codeDetail, Model model) throws Exception {
        model.addAttribute(codeDetailService.read(codeDetail));

        List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
        model.addAttribute("groupCodeList", groupCodeList);
    }

    @PostMapping(value = "/remove")
    public String remove(CodeDetail codeDetail, RedirectAttributes rttr) throws Exception {
        codeDetailService.remove(codeDetail);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codedetail/list";
    }

    @GetMapping(value = "/modify")
    public void modifyForm(CodeDetail codeDetail, Model model) throws Exception {
        model.addAttribute(codeDetailService.read(codeDetail));

        List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
        model.addAttribute("groupCodeList", groupCodeList);
    }

    @PostMapping(value = "/modify")
    public String modify(CodeDetail codeDetail, RedirectAttributes rttr) throws Exception {
        codeDetailService.modify(codeDetail);
        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codedetail/list";
    }

}
