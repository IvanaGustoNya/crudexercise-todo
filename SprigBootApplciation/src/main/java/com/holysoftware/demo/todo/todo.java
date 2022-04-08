package com.holysoftware.demo.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity

public class todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String description;
    private String targetDate;

    public todo() {
    }

    public todo(Long id, String username, String description, String targetDate) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
    }

    public todo(String username, String description, String targetDate) {
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate='" + targetDate + '\'' +
                '}';
    }
}