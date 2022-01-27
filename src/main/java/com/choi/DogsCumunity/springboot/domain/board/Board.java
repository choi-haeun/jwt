package com.choi.DogsCumunity.springboot.domain.board;

import com.choi.DogsCumunity.springboot.domain.BaseTimeClass;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Board extends BaseTimeClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardNum;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public Board(String writer, String title, String content){
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

}
