package com.springcloud.eureka_client_ribbon_consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.eureka_client_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuefeilai
 * @date 2021-11-24 16:01:41
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    //实现熔断机制返回字符串提示：当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开。
    @HystrixCommand(fallbackMethod = "fallbackMessage")
    public String buyTicket() {
        return restTemplate.getForObject("http://EUREKA-CLIENT-PRODUCER/buy-ticket", String.class);
    }

    public String fallbackMessage() {
        return "不好意思，服务断了，请稍后再试";
    }
}
