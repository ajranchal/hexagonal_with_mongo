package com.hexagonal.infrastructure.queue.kafka.consumer;


import com.hexagonal.domain.ports.primary.ProcessIncomingEventsPrimaryPort;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class ExampleConsumer {


    @Autowired
    private ProcessIncomingEventsPrimaryPort processIncomingEventsPrimaryPort;

    @KafkaListener(topics = "${spring.kafka.topic-name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<?, ?> consumerRecord) throws IOException {
        log.info("received payload='{}'", consumerRecord.toString());
        if(consumerRecord != null || !consumerRecord.toString().equals("")) {
            processIncomingEventsPrimaryPort.process(consumerRecord.toString());
        } else {
            log.info("Message no received");
        }



    }


}
