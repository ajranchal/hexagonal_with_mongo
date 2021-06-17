package com.hexagonal.infrastructure.controller.api.rest.adapter;

import com.hexagonal.domain.ports.primary.HelloWorldPrimaryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HelloWorldAdapter {

    @Autowired
    private HelloWorldPrimaryPort helloWorldPrimaryPort;

    public String getHelloWorld(String language){
        Optional<String> hello = helloWorldPrimaryPort.helloWorld(language);
        if(hello.isPresent()){
            return hello.get();
        }
        return "";
    }

}
