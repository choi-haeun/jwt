package com.choi.DogsCumunity.springboot.domain.user;

import com.choi.DogsCumunity.springboot.domain.BaseTimeClass;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserNum;

    @Column(nullable = false, length = 15 )
    private String userId;

    @Column(nullable = false)
    private String userPw;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, length = 11)
    private int userPhone;

    private String userAdress;

    private String userEmail;

    private int userValue;

    @Builder
    public User(String userId, String userPw, String userName, int userPhone, String userAdress, String userEmail){
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdress = userAdress;
        this.userEmail = userEmail;
    }

    public void update(String userPw,String userName,int userPhone,String userAdress,String userEmail){
        this.userPw = userPw;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdress = userAdress;
        this.userEmail = userEmail;
    }
}

