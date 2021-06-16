package com.hexagonal.infrastructure.db.mongodb.repository;

import com.hexagonal.infrastructure.db.mongodb.model.HelloWorldEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface HelloWorldRepository extends MongoRepository<HelloWorldEntity, String> {

    public HelloWorldEntity getHelloWorldById(String id);

    public HelloWorldEntity getHelloWorldByLanguage(String language);

}
