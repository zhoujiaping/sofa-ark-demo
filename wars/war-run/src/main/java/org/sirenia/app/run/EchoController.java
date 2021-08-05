package org.sirenia.app.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/08/05
 */
@RestController
@RequestMapping("/echo")
public class EchoController {
    @GetMapping("")
    public Object echo(){
        return "ok";
    }
}
