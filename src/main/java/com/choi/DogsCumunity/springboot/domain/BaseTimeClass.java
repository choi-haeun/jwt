package com.choi.DogsCumunity.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   //이 클래스를 상속받을 경우 필드들도 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class)  //클래스에 Auditing 기능포함시킴(
//Jpa Auditing : 시간에 대해서 자동으로 값을 넣어줌(자동으로 시간을 매핑하여 DB의 테이블에 넣어줌)
public class BaseTimeClass {
    //모든 Entity들의 상위 클래스가 됨
    //Entity들의 createdDate와 modifiedDate를 자동으로 관리

    @CreatedDate    //Entity가 생성되어 저장될떄 시간이 자동으로 저장됨
    private LocalDateTime createdDate;

    @LastModifiedDate   //조회한 Entity의 값이 변경될떄 시간이 자동으로 저장됨
    private LocalDateTime modifiedDate;


}
