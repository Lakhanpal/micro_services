package com.techmojo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {

  @RequestMapping("/hello")
  public String greeting(@RequestParam("greet") String greet) {
      return greet + " from Lakhan!";
  }
  
}
