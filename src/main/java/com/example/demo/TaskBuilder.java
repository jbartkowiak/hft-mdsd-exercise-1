package com.example.demo;

public class TaskBuilder {
    private Task task;

    public TaskBuilder(String name) {
        this.task = new Task(name);
    }

    public TaskBuilder withDescription(String description) {
        task.setDescription(description);
        return this;
    }

    public Task build() {
        return task;
    }
}