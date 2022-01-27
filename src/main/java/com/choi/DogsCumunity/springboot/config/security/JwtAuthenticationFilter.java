package com.choi.DogsCumunity.springboot.config.security;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public  class JwtAuthenticationFilter extends GenericFilterBean {
    private final JwtProvider jwtProvider;

    //jwt 유효성 검증
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String token =
    }
}
