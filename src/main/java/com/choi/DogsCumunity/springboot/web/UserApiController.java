package com.choi.DogsCumunity.springboot.web;

import com.choi.DogsCumunity.springboot.Service.UserService;
import com.choi.DogsCumunity.springboot.web.dto.userDto.UserResponseDto;
import com.choi.DogsCumunity.springboot.web.dto.userDto.UserSignRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor    //final이 선언된 인자값을 생성해줌
@RestController
public class UserApiController {

    private final UserService service;


    @PostMapping("/api/user/userSignUp")
    public Long userSignUp(@RequestBody UserSignRequestDto requestDto){
        return service.userSingUp(requestDto);
    }


}
