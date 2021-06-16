package com.hexagonal.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb")
@Data
public class MongoDBConfiguration {


    private String url;
    private int port;
    private String user;
    private String password;


    public @Bean MongoClient mongoClient() {
        return MongoClients.create("mongodb+srv://"+user+":"+password+"@"+url);
    }
}
