package com.alipay.sofa.ark.sample1;

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
@RequestMapping("/sample1")
public class Sample1Controller {
    @PostConstruct
    public void init(){
        System.out.println("sample1 controller");
        System.out.println("sample1 classloader=>"+this.getClass().getClassLoader());
    }

    @GetMapping("")
    public String sample1(){
        System.out.println("sample1==>"+ HiUtil.v1());
        return HiUtil.v1();
    }
}
