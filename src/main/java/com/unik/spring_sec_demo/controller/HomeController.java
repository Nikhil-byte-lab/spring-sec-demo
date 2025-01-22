package com.unik.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Welcome";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "Telusko " + request.getSession().getId();
    }
}
