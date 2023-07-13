package com.tqm.studentjpa.service.impl;

import com.tqm.studentjpa.repo.ClassroomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImpl {

    private final ClassroomRepo classroomRepo;

    @Autowired
    public ClassroomServiceImpl(ClassroomRepo classroomRepo) {
        this.classroomRepo = classroomRepo;
    }
}
