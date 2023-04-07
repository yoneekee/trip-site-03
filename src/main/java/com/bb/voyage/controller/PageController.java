package com.bb.voyage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/accomodation/hotel")
    public String hotel(){
        return "/accomodation/hotel";
    }
    @GetMapping("/accomodation/pension")
    public String pension(){
        return "/accomodation/pension";
    }
    @GetMapping("/accomodation/sharehouse")
    public String sharehouse(){
        return "/accomodation/sharehouse";
    }
    
    @GetMapping("/company/companyinfo")
    public String companyinfo(){
        return "/company/companyinfo";
    }
    @GetMapping("/company/companypolicy")
    public String companypolicy(){
        return "/company/companypolicy";
    }
    @GetMapping("/company/companyprofile")
    public String companyprofile(){
        return "/company/companyprofile";
    }
    @GetMapping("/contact/contact")
    public String contact(){
        return "/contact/contact";
    }
    @GetMapping("/contact/reservation")
    public String reservation(){
        return "/contact/reservation";
    }
}
