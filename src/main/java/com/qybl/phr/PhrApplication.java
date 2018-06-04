package com.qybl.phr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:*.xml"})
@ComponentScan(value = "com.qybl.phr")
@SpringBootApplication
public class PhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhrApplication.class, args);
    }
}
