package com.hexagonal.initialha.infrastructure.db.mongodb.model;


import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@ToString
@Value
@Document(collection = "helloworlds")
public class HelloWorldEntity {

    @Id
    private String id;

    private String language;

    private String hello;

}
