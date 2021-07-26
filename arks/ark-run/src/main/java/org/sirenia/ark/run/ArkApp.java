package org.sirenia.ark.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这个类的包路径，要避免和业务的springboot项目中组件扫描的包路径有包含和被包含的关系。
 * 如果路径可以扫描到某个springboot项目的组件，那么那些组件会被被创建两次。
 * 在ArkApp（在公共的classloader上）和某App（在某App ark-biz包的classloader上）分别被扫描一次。
 * */
@SpringBootApplication
public class ArkApp {

    public static void main(String[] args) {
        //SofaArkBootstrap.launch(args);
        SpringApplication.run(ArkApp.class, args);
    }
}