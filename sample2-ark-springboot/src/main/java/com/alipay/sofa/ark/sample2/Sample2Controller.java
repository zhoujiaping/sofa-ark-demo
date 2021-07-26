package com.alipay.sofa.ark.sample2;

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
@RequestMapping("/sample2")
public class Sample2Controller {

    @PostConstruct
    public void init(){
        System.out.println("sample2 controller");
        System.out.println("sample2 classloader=>"+this.getClass().getClassLoader());
    }
    @GetMapping("")
    public String sample2(){
        System.out.println("sample2==>"+ HiUtil.v2());
        return HiUtil.v2();
    }
}
