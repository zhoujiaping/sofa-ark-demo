package org.sirenia.app1.controller;

import org.sirenia.util.HiUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author sirenia
 * @description
 * @date 2021/07/25
 */
@RestController
@RequestMapping("/echo")
public class AppController {
    @PostConstruct
    public void init(){
        System.out.println("app1 controller");
        System.out.println("app1 controller classloader=>"+this.getClass().getClassLoader());
    }

    @GetMapping("")
    public String echo(){
        System.out.println("app1==>"+ HiUtil.v1());
        return HiUtil.v1();
    }
}
