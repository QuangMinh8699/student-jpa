package com.tqm.studentjpa.service.impl;

import com.tqm.studentjpa.entity.Student;
import com.tqm.studentjpa.repo.StudentRepo;
import com.tqm.studentjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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

    @Override
    public void createNewStudent(Student student) throws Exception {

        if (ObjectUtils.isEmpty(student)) {
            throw new Exception("student is empty !");
        }

        if (!ObjectUtils.isEmpty(studentRepo.findByName(student.getName()))) {
            throw new Exception("Student is ready exiting !");
        }

        studentRepo.save(student);
    }

    @Override
    public void deleteStudentById(Long id) throws Exception {
        if (!ObjectUtils.isEmpty(studentRepo.findById(id))) {
            throw new Exception("student is not ready exiting !");
        }

        studentRepo.deleteById(id);
    }
}
