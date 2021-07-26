package org.sirenia.app2.controller;

import org.sirenia.HiUtil;
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
        System.out.println("app2 controller");
        System.out.println("app2 controller classloader=>"+this.getClass().getClassLoader());
    }
    @GetMapping("")
    public String echo(){
        System.out.println("app2==>"+ HiUtil.v2());
        return HiUtil.v2();
    }
}
