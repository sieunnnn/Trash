package com.example.imageSalesSite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/auth")
public class LoginController {

    // 등록 화면
    @RequestMapping(value = "/login")
    public String loginForm(String error, String logout, Model model) {

        if(error != null) {
            model.addAttribute("error", "Login Error!!");
        }

        if(logout != null) {
            model.addAttribute("logout", "Logout!!");
        }

        return "auth/loginForm";
    }
}
