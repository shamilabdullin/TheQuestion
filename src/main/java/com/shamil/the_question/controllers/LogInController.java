package com.shamil.the_question.controllers;

import com.shamil.the_question.dto.SignUpDto;
import com.shamil.the_question.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LogInController {

    @Autowired
    private UserService userService;


    @GetMapping("/signIn")
    public String getLogInPage() {
        return "log_in";
    }


    @PostMapping("/signIn")
    public String signUp(SignUpDto form, BindingResult result, RedirectAttributes redirectAttributes) {
        return "redirect:/signIn";
    }
}