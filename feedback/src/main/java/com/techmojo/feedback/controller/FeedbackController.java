package com.techmojo.feedback.controller;

import com.techmojo.feedback.client.UserServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

  @Autowired
  private UserServiceClient userServiceClient;
  
  @RequestMapping(value="/test-feing",method=RequestMethod.GET)
  public String greeting(@RequestParam("greet") String greet) {
      return userServiceClient.greeting(greet);
  }
  
}
