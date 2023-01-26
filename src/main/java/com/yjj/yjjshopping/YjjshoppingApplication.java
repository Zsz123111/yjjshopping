package com.yjj.yjjshopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.yjj.yjjshopping.mapper")
@ServletComponentScan
public class YjjshoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjjshoppingApplication.class, args);
    }

}
