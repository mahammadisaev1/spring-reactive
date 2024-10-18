package com.demo.springreactive.student;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table(name = "students")
public class Student {

    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
}
