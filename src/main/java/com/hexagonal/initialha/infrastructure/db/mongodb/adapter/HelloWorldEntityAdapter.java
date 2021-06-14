package com.hexagonal.initialha.infrastructure.db.mongodb.adapter;

import com.hexagonal.initialha.domain.ports.StoredHelloWorldSecondaryPort;
import com.hexagonal.initialha.infrastructure.db.mongodb.model.HelloWorldEntity;
import com.hexagonal.initialha.infrastructure.db.mongodb.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HelloWorldEntityAdapter implements StoredHelloWorldSecondaryPort {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    @Override
    public String getHelloWorldById (String id){
        return helloWorldRepository.getHelloWorldById(id).getHello();
    }

    @Override
    public String getHelloWorldByLanguage(String language) {
        return helloWorldRepository.getHelloWorldByLanguage(language).getHello();
    }

    @Override
    public List<String> getAll() {
        System.out.println(helloWorldRepository.findAll());
        return helloWorldRepository.findAll().stream().map(HelloWorldEntity::getLanguage).collect(Collectors.toList());
    }


}
