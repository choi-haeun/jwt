package com.choi.DogsCumunity.springboot.domain.item;

import com.choi.DogsCumunity.springboot.domain.BaseTimeClass;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Item extends BaseTimeClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemNum;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private Long itemPrice;

    private String itemDetail;

    @Column(nullable = false)
    private Long itemstucked;

    @Builder
    public Item(String itemName, Long itemPrice, String itemDetail, Long itemstucked){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDetail = itemDetail;
        this.itemstucked = itemstucked;
    }



}
