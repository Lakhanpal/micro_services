package com.techmojo.feedback.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-microservice")
public interface UserServiceClient {

  @RequestMapping("/hello")
  String greeting(@RequestParam("greet") String greet);

}
