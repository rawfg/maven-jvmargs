package com.example.plugin.bug.mavenjvmargs;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class PropertyConfiguration {

    @PostConstruct
    public void postConstruct() {
        System.getProperties().entrySet().stream()
            .filter(entry -> String.valueOf(entry.getKey()).contains("xyz"))
            .forEach(System.out::println);
    }
}
