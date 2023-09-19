package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.domain.ChargeCoin;
import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.security.domain.CustomUser;
import com.example.imageSalesSite.service.CoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/coin")
public class CoinController {

    private final CoinService service;

    private final MessageSource messageSource;

    // 코인 충전 화면
    @GetMapping(value = "/charge")
    @PreAuthorize("hasRole('MEMBER')")
    public void chargeForm(Model model) throws Exception {

        ChargeCoin chargeCoin = new ChargeCoin();
        chargeCoin.setAmount(1000);

        model.addAttribute(chargeCoin);
    }

    // 코인 충전 처리
    @PostMapping(value = "/charge")
    @PreAuthorize("hasRole('MEMBER')")
    public String Charge(int amount, RedirectAttributes rttr, Authentication authentication) throws Exception {
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Member member = customUser.getMember();

        Long userNo = member.getUserNo();

        ChargeCoin chargeCoin = new ChargeCoin();

        chargeCoin.setUserNo(userNo);
        chargeCoin.setAmount(amount);

        service.charge(chargeCoin);

        String message = messageSource.getMessage("coin.chargingComplete", null, Locale.KOREAN);
        rttr.addFlashAttribute("msg", message);

        return "redirect:/coin/success";
    }

    // 충전 내역 화면
    @GetMapping(value = "/list")
    @PreAuthorize("hasRole('MEMBER')")
    public void list(Model model, Authentication authentication) throws Exception {

        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Member member = customUser.getMember();

        Long userNo = member.getUserNo();

        model.addAttribute("list", service.list(userNo));

    }

    // 코인 충전 성공 화면
    @GetMapping(value = "/success")
    public String success() throws Exception {
        return "coin/success";
    }

    // 사용자의 구매 내역 보기 요청을 처리한다
    @GetMapping(value = "/listPay")
    @PreAuthorize("hasRole('MEMBER')")
    public void listPayHistory(Model model, Authentication authentication) throws Exception {
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Member member = customUser.getMember();

        Long userNo = member.getUserNo();

        model.addAttribute("list", service.listPayHistory(userNo));
    }

}
