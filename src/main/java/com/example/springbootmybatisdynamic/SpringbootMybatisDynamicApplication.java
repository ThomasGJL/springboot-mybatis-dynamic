package com.example.springbootmybatisdynamic;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.example.springbootmybatisdynamic.dao")
public class SpringbootMybatisDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDynamicApplication.class, args);
    }

}
