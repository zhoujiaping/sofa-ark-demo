package com.alipay.sofa.ark.sample3;

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
@RequestMapping("/sample3")
public class Sample3Controller {
    @PostConstruct
    public void init(){
        System.out.println("sample3 controller");
    }

    @GetMapping("")
    public String sample3(){
        System.out.println("sample3==>"+ HiUtil.v1());
        return HiUtil.v1();
    }
}
