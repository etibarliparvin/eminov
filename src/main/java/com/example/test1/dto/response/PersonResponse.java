package com.example.test1.dto.response;

import lombok.Data;

@Data
public class PersonResponse {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
}
