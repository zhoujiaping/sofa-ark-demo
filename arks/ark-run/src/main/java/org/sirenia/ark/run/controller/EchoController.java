package org.sirenia.ark.run.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sirenia
 * @description
 * @date 2021/07/25
 */
@RestController
@RequestMapping("/echo")
public class EchoController {
    @GetMapping
    public Object echo(){
        return "echo";
    }
}
