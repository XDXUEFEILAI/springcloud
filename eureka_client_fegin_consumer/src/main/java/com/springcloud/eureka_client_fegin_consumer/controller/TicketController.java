package com.springcloud.eureka_client_fegin_consumer.controller;

import com.springcloud.eureka_client_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuefeilai
 * @date 2021-11-24 16:34:37
 */
@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @GetMapping("/buy-ticket")
    public String buyTicket() {
        return ticketService.buyTicket();
    }
}