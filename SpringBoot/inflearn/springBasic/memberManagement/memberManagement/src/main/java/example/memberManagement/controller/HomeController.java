package example.memberManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // local 8080 으로 들어오면 바로 호출된다.
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
