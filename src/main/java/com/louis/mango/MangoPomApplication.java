package com.louis.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.louis.mango"})//配置扫描包，扫描com.louis.mango包及其子包
public class MangoPomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoPomApplication.class, args);
    }

}
