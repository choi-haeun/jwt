package com.choi.DogsCumunity.springboot.web.dto.userDto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserUpdateRequestDto {

    private String userPw;
    private String userName;
    private int userPhone;
    private String userAdress;
    private String userEmail;

    @Builder
    public UserUpdateRequestDto(String userPw,String userName,int userPhone,String userAdress,String userEmail){
        this.userPw = userPw;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdress = userAdress;
        this.userEmail = userEmail;
    }
}
