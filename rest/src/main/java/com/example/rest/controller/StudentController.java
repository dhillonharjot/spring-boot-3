package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dto.studentDTO;

@RestController
public class StudentController {
    @GetMapping("/student")
    public studentDTO getStudents() {
        return new studentDTO(1L, "Harjot","dharjot51@gmail.com");
    }
}
