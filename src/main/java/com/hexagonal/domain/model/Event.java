package com.hexagonal.domain.model;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class Event {

    private String message;
    private Date dateEvent;
    private EventType eventType;

}
