package com.choi.DogsCumunity.springboot.config.security;

import com.choi.DogsCumunity.springboot.Service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

@RequiredArgsConstructor
@Component
public class JwtProvider {

    @Value("spring.jwt.secret")
    private String secretKey;
    private Long tokenValidMillSecond = 60*60*1000L;
    private final UserService userService;

    @PostConstruct
    protected void init(){
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());

    }

    //jwt 생성
    public String createToken(Long userNum, List<String> roles){
        //Claims 에 user Pk값
        Claims claims = Jwts.claims().setSubject(userNum);
    }

}
