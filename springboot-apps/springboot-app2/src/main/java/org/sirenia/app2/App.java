package org.sirenia.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.PostConstruct;

/**
 * 普通的springboot webmvc应用
 * */
@SpringBootApplication
public class App {

    @PostConstruct
    public void init(){
        System.out.println("wtf2?");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}