package com.springcloud.eureka_client_fegin_consumer.service;

import com.springcloud.eureka_client_service.service.TicketService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuefeilai
 * @date 2021-11-24 16:27:05
 */

/**
 * fegin方式调用微服务:fegin本身具备ribbon功能，支持负载均衡
 * fallback:指定熔断恢复调用的类对应的方法
 */
@FeignClient(value = "EUREKA-CLIENT-PRODUCER",fallback = HystrixFallbackServiceImpl.class)
public interface TicketServiceImpl extends TicketService {
    @Override
    @GetMapping("/buy-ticket")
    String buyTicket();
}
