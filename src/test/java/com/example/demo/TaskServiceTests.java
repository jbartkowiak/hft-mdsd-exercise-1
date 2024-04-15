package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskServiceTests {
    @Autowired
    private TaskService taskService;

    @Test
    public void testTaskCreation() {
        Task task = taskService.createTask();
        assertEquals("ExampleTask", task.getName());
        assertEquals("This is a DSL defined task.", task.getDescription());
    }
}