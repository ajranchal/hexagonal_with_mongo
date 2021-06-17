package com.hexagonal.infrastructure.controller.api.rest;

import com.hexagonal.infrastructure.controller.api.rest.model.EventRequest;
import com.hexagonal.infrastructure.queue.kafka.producer.ExampleProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaResource {

    private final ExampleProducer producer;


    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody final EventRequest eventRequest) {
        this.producer.sendMessage(eventRequest.getTopic(), eventRequest.getMessage());
    }
}
