package com.hexagonal.infrastructure.db.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@ToString
@Value
@Builder
@Document(collection = "example_events")
public class KafkaExampleEventEntity {

    @Id
    private String id;

    private String message;

    private Date dateEvent;

}
