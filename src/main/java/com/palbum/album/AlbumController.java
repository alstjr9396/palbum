package com.palbum.album;

import com.palbum.Account.Account;
import com.palbum.Account.CurrentAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/new-study")
    public String studyForm(@CurrentAccount Account account, Model model) {
        model.addAttribute(account);
        model.addAttribute(new AlbumForm());

        return "album/form";
    }
}
