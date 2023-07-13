package com.tqm.studentjpa.service.impl;

import com.tqm.studentjpa.entity.Student;
import com.tqm.studentjpa.repo.StudentRepo;
import com.tqm.studentjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getListStudent() {
        return studentRepo.findAll();
    }
}
