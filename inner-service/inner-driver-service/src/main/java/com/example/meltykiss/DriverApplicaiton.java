package com.example.meltykiss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan("com.example.meltykiss.mapper")
@ComponentScan({"com.example.meltykiss.service","com.example.meltykiss.controller"})
public class DriverApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(DriverApplicaiton.class, args);
    }
}
