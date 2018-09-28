package com.techmojo.gateway.auth;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class AuthenticationService {

  public HttpStatus checkAuth(HttpServletRequest request)
  {
    return HttpStatus.OK;
  }
  
}
