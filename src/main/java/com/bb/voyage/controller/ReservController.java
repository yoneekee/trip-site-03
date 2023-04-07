package com.bb.voyage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservController {
    @GetMapping("/reservation")
    public String reservation(){
        return "/reservation";
    }

    @PostMapping("/reservation")
    public String reservProcess(){
        return "redirect: /member/info";
    }

    @GetMapping("/package")
    public String packageInput(){
        return "/package";
    }

    @PostMapping("/package")
    public String packageInputProcess(){
        return "redirect: /member/info";
    }
}
