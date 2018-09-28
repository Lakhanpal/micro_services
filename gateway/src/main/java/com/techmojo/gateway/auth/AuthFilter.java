package com.techmojo.gateway.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthFilter implements Filter {
  private static final Logger logger = LoggerFactory.getLogger(WebFilter.class);

  @Autowired
  private AuthenticationService authenticationService;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    logger.debug("Initiating WebFilter >> ");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpStatus httpStatus =  authenticationService.checkAuth(req);
    
    HttpServletResponse res = (HttpServletResponse) response;
    res.setStatus(httpStatus.value());
    System.out.println(" called filter...");
    if(httpStatus == HttpStatus.OK)
    {
      chain.doFilter(req, res);
    }else{
      res.setStatus(httpStatus.value());
    }
    
  }
 
  @Override
  public void destroy() {
    logger.debug("Destroying WebFilter >> ");
  }
}
