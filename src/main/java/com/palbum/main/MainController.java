package com.palbum.main;

import com.palbum.Account.Account;
import com.palbum.Account.CurrentAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(@CurrentAccount Account account) {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
