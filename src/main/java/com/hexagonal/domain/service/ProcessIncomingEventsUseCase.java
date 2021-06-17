package com.hexagonal.domain.service;

import com.hexagonal.domain.model.Event;
import com.hexagonal.domain.model.EventType;
import com.hexagonal.domain.ports.primary.ProcessIncomingEventsPrimaryPort;
import com.hexagonal.domain.ports.secondary.SaveEventSecondaryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;

@Component
public class ProcessIncomingEventsUseCase implements ProcessIncomingEventsPrimaryPort {

    @Autowired
    private SaveEventSecondaryPort saveEventSecondaryPort;

    @Override
    public void process(String message) {

        Event event = Event.builder().message(message).dateEvent(Date.from(Instant.now())).eventType(EventType.RECEIVED).build();
        saveEventSecondaryPort.save(event);


    }
}
