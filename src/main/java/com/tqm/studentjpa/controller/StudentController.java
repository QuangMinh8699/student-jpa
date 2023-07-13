package com.tqm.studentjpa.controller;

import com.tqm.studentjpa.entity.Student;
import com.tqm.studentjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getListStudent() {
        return studentService.getListStudent();
    }
}
