package com.hexagonal.initialha.domain.service;

import com.hexagonal.initialha.domain.ports.HelloWorldPrimaryPort;
import com.hexagonal.initialha.domain.ports.StoredHelloWorldSecondaryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class HelloWorldUseCase implements HelloWorldPrimaryPort {

    @Autowired
    private StoredHelloWorldSecondaryPort storedHelloWorldSecondaryPort;

    @Override
    public String helloWorld(String language) {
        return storedHelloWorldSecondaryPort.getAll().stream().filter(s -> s.equals(language)).collect(Collectors.joining());

    }
}
