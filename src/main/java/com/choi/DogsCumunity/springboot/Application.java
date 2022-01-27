package com.choi.DogsCumunity.springboot;

import com.choi.DogsCumunity.springboot.domain.BaseTimeClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
//스프링부트의 자동설정, Bean 읽기와 생성 자동 생성. 이 위치 부터 설정을 읽어감->프로젝트 최상단에 위치
public class Application extends BaseTimeClass {

    @CreatedDate
    public void main(String[] args){        //내장 WAS 실행 메소드
        SpringApplication.run(Application.class,args);
    }
}
