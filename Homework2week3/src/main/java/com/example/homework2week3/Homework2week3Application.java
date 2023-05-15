package com.example.homework2week3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Homework2week3Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework2week3Application.class, args);
    }
    @Bean
    @Qualifier("1")
    public String getMessage1(){
        System.out.println("Hey from message1");
        return "1";
    }
    @Bean
    @Qualifier("2")
    public String getMessage2(@Qualifier("3")  String data){ // حيطبع كوالي فير ٣ اول بعدها حيرجع ل٢
        System.out.println("Hey from Message2");
        return data;
    }
    @Bean
    @Qualifier("3")
    public String getMessage3(){
        System.out.println("Hey from message3");
        return "3";
    }

}


// السؤال الاول راح يعطي
// message1

// السؤال الثاني
//راح يطبع message1 بعدها message2

//السؤال الثالث
//راح يطبع message 3 قبل message 2

//السؤال الرابع
// راح يطبع controller بعد message1

//السؤال الخامس
//  راح يطبع controller بعد message٢
//message 2 قبل message3