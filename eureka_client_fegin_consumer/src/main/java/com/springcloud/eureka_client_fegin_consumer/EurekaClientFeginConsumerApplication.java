package com.springcloud.eureka_client_fegin_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
//开启fegin微服务调用
@EnableFeignClients
public class EurekaClientFeginConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeginConsumerApplication.class, args);
    }

}
