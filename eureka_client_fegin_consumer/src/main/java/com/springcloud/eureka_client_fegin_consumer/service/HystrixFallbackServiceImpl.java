package com.springcloud.eureka_client_fegin_consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author xuefeilai
 * @date 2021-11-24 16:52:16
 */
@Component
public class HystrixFallbackServiceImpl implements TicketServiceImpl {
    @Override
    public String buyTicket() {
        return "服务断了@@@_@@@@";
    }
}
