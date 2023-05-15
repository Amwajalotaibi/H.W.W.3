package com.example.homework2week3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Miancontroller {
    String data;
//    public Miancontroller(@Qualifier("1") String data){
//        this.data=data;
//        System.out.println("Hey from Main Controller");
//    }
    public Miancontroller(@Qualifier("2") String data) {
        this.data = data;
        System.out.println("Hey from Main Controller");
    }
}
