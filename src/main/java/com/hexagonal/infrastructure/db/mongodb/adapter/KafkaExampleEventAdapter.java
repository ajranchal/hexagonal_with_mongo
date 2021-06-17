package com.hexagonal.infrastructure.db.mongodb.adapter;

import com.hexagonal.domain.model.Event;
import com.hexagonal.domain.ports.secondary.SaveEventSecondaryPort;
import com.hexagonal.infrastructure.db.mongodb.model.KafkaExampleEventEntity;
import com.hexagonal.infrastructure.queue.kafka.producer.repository.KafkaEventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaExampleEventAdapter implements SaveEventSecondaryPort {

    @Autowired
    private KafkaEventsRepository kafkaEventsRepository;


    @Override
    public void save(Event event) {


        kafkaEventsRepository.save(adapt(event));


    }

    private KafkaExampleEventEntity adapt(Event event){

        return KafkaExampleEventEntity.builder().dateEvent(event.getDateEvent()).message(event.getMessage()).build();

    }
}
