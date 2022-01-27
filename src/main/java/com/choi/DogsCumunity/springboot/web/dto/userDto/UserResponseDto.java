package com.choi.DogsCumunity.springboot.web.dto.userDto;

import com.choi.DogsCumunity.springboot.domain.user.User;
import lombok.Getter;

@Getter
public class UserResponseDto {

    private String userId;
    private String userPw;
    private String userName;
    private int userPhone;
    private String userAdress;
    private String userEmail;

    public UserResponseDto(User entity){
        this.userId = entity.getUserId();
        this.userPw = entity.getUserPw();
        this.userName = entity.getUserName();
        this.userPhone = entity.getUserPhone();
        this.userAdress = entity.getUserAdress();
        this.userEmail = entity.getUserEmail();
    }
}
