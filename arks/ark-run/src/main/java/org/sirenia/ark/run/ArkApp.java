package org.sirenia.ark.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(/*scanBasePackageClasses =
        {org.sirenia.app1.App1.class,org.sirenia.app2.App2.class}*/)
public class ArkApp {

    public static void main(String[] args) {
        //SofaArkBootstrap.launch(args);
        SpringApplication.run(ArkApp.class, args);
    }
}