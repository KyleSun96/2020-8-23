package com.kylesun.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: KyleSun swy0907163@163.com
 **/
@EnableDiscoveryClient  // 用于客户端注册服务和拉取服务，包含了@EnableEurekaClient
@MapperScan(basePackages = "com.kylesun.order.mapper")  // 通用mapper扫描dao
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
