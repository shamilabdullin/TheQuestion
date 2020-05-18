package com.shamil.the_question.controllers;

import com.shamil.the_question.dto.SignUpDto;
import com.shamil.the_question.models.User;
import com.shamil.the_question.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "user_form";
    }

    @PostMapping("/signUp")
    public String signUp(SignUpDto form){
        try {
            User user = service.signUp(form);
            return "redirect:/questions";
        } catch (javax.validation.ConstraintViolationException | NullPointerException e){
            return "registration failed"; //немного иначе
        }
    }
}
