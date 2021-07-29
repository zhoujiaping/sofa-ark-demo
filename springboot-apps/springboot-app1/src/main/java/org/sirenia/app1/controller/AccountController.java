package org.sirenia.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sirenia
 * @description
 * @date 2021/07/25
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/echo")
    public String echo(){
       return "account echo";
    }
}
