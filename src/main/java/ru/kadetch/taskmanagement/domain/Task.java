package ru.kadetch.taskmanagement.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Task {

    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime dateOfRealize;
    private LocalDateTime dateOfSet;
    private boolean completed;

    public Task(){
        this.id = UUID.randomUUID().toString();
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public Task(String name){
        this();
        this.name = name;
    }

    public Task(String name, String description){
        this(name);
        this.description = description;
    }
}
