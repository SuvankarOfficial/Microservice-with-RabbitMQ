package com.audit.controller;

import com.audit.service.AuditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AuditController {

    @Autowired
    private AuditService auditService;

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consume(String message){
        log.info(String.format("Received message -> %s", message));
        this.auditService.saveAudit(message);
    }

}
