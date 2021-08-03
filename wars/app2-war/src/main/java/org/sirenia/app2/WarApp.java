package org.sirenia.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @description
 * @date 2021/08/03
 */
@SpringBootApplication
public class WarApp extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WarApp.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(WarApp.class, args);
    }
}