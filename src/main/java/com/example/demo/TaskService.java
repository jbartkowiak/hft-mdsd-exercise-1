package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public Task createTask() {
        return DslBuilder.createTask("ExampleTask")
                .withDescription("This is a DSL defined task.")
                .build();
    }
}