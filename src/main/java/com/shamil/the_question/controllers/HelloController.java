package com.shamil.the_question.controllers;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String getMainPage(ModelMap map, Authentication authentication){
        map.addAttribute("authentication", authentication);
        return "start_page";
    }
}
