package com.hexagonal.infrastructure.db.mongodb.adapter;

import com.hexagonal.infrastructure.db.mongodb.model.HelloWorldEntity;
import com.hexagonal.domain.ports.secondary.HelloWorldRepositorySecondaryPort;
import com.hexagonal.infrastructure.db.mongodb.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HelloWorldRepositoryEntityAdapter implements HelloWorldRepositorySecondaryPort {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    @Override
    public String getHelloWorldById(String id) {
        return helloWorldRepository.getHelloWorldById(id).getHello();
    }

    @Override
    public String getHelloWorldByLanguage(String language) {
        HelloWorldEntity entity = helloWorldRepository.getHelloWorldByLanguage(language);
        if(entity != null) return entity.getHello();
        return "";
    }

    @Override
    public List<String> getAll() {

        return helloWorldRepository.findAll().stream().map(HelloWorldEntity::getHello).collect(Collectors.toList());
    }


}
