package com.hexagonal.domain.service;

import com.hexagonal.domain.ports.primary.HelloWorldPrimaryPort;
import com.hexagonal.domain.ports.secondary.HelloWorldRepositorySecondaryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class HelloWorldUseCase implements HelloWorldPrimaryPort {

    @Autowired
    private HelloWorldRepositorySecondaryPort helloWorldRepositorySecondaryPort;

    @Override
    public Optional<String> helloWorld(String language) {

        return Optional.of(helloWorldRepositorySecondaryPort.getHelloWorldByLanguage(language));

    }
}
