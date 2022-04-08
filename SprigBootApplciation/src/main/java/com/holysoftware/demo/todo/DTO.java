package com.holysoftware.demo.todo;

import lombok.Data;

@Data
public class DTO {
    private Long id;
    private String username;
    private String description;
    private String targetDate;

}
