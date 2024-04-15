package com.example.demo;

public class DslBuilder {
    public static TaskBuilder createTask(String name) {
        return new TaskBuilder(name);
    }
}
