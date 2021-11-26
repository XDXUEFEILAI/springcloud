package com.springcloud.eureka_client_ribbon_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//表明这个是eurekaclient
@EnableEurekaClient
//向注册中心注册一个client
@EnableDiscoveryClient
@EnableHystrix
public class EurekaClientRibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientRibbonConsumerApplication.class, args);
    }

    //开启负载均衡功能
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
