package com.hexagonal.infrastructure.controller.api.rest;

import com.hexagonal.infrastructure.controller.api.rest.adapter.HelloWorldAdapter;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Component
@AllArgsConstructor
@RestController
public class HelloWorldResource {

    @Autowired
    private HelloWorldAdapter helloWorldAdapter;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @RequestMapping("/hello/world/{id}")
    public String Hello(@PathVariable("id") String language){

        return helloWorldAdapter.getHelloWorld(language);


    }


    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @RequestMapping("/test")
    public String test(){
        System.out.println("Hello");
        return "Hello";


    }
}
