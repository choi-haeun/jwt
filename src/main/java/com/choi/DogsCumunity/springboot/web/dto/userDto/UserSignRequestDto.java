package com.choi.DogsCumunity.springboot.web.dto.userDto;

import com.choi.DogsCumunity.springboot.domain.user.User;

public class UserSignRequestDto {

    private String userId;
    private String userPw;
    private String userName;
    private int userPhone;
    private String userAdress;
    private String userEmail;

    public UserSignRequestDto(String userId,String userPw,String userName,int userPhone,String userAdress, String userEmail){
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdress = userAdress;
        this.userEmail = userEmail;
    }

    public User toEntity(){
        return User.builder()
                .userId(userId)
                .userPw(userPw)
                .userName(userName)
                .userPhone(userPhone)
                .userAdress(userAdress)
                .userEmail(userEmail)
                .build();
    }
}
