package com.springcloud.eureka_client_producer.service;

import com.springcloud.eureka_client_service.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author xuefeilai
 * @date 2021-11-24 15:58:47
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String buyTicket() {
        System.out.println("8762-producer");
        return "《无问西东》";
    }
}
