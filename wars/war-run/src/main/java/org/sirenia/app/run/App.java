package org.sirenia.app.run;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * 普通的springboot webmvc应用
 * */
@SpringBootApplication
public class App {

    @PostConstruct
    public void init(){
        System.out.println("wtf?");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Bean
    public ServletWebServerFactory tomcatServletWebServerFactory() {
        System.out.println("init tomcatServletWebServerFactory...");
        var fac = new TomcatServletWebServerFactory() {
            @Override
            protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
                new File(tomcat.getServer().getCatalinaBase(), "webapps").mkdirs();
                //tomcat.setHost(new StandardHost());
                try {

                    //String app1 = Class.forName("org.sirenia.app1.App").getProtectionDomain().getCodeSource().getLocation().getFile();
                    String app1 = ResourceUtils.getFile("classpath:app1.war").getAbsolutePath();
                    Context context1 =
                            tomcat.addWebapp("/app1", app1);
                    context1.setParentClassLoader(getClass().getClassLoader());

                    //String app2 = Class.forName("org.sirenia.app2.App").getProtectionDomain().getCodeSource().getLocation().getFile();
                    String app2 = ResourceUtils.getFile("classpath:app2.war").getAbsolutePath();
                    Context context2 =
                            tomcat.addWebapp("/app2", app2);
                    context2.setParentClassLoader(getClass().getClassLoader());
                } catch (Exception ex) {
                    throw new IllegalStateException("Failed to add webapp", ex);
                }
                return super.getTomcatWebServer(tomcat);
            };
        };
        var base = new File("./");
        System.out.println("base=>"+base);
        new File(base,"/webapps/app1").mkdirs();
        new File(base,"/webapps/app2").mkdirs();
        return fac;
    }
}