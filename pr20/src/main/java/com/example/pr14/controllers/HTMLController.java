package com.example.pr14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
