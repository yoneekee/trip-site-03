package com.bb.voyage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping({"/","/index"})
  public String home() {
    return "/index/index";
  }

  @GetMapping("/country/korea")
  public String korea() {
    return "/country/korea";
  }
  @GetMapping("/country/japan")
  public String japan() {
    return "/country/japan";
  }
  @GetMapping("/country/china")
  public String china() {
    return "/country/china";
  }
}
