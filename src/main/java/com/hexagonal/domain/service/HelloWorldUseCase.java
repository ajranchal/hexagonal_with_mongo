package com.hexagonal.domain.service;

import com.hexagonal.domain.ports.HelloWorldPrimaryPort;
import com.hexagonal.domain.ports.StoredHelloWorldSecondaryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class HelloWorldUseCase implements HelloWorldPrimaryPort {

    @Autowired
    private StoredHelloWorldSecondaryPort storedHelloWorldSecondaryPort;

    @Override
    public Optional<String> helloWorld(String language) {

        return Optional.of(storedHelloWorldSecondaryPort.getHelloWorldByLanguage(language));

    }
}
