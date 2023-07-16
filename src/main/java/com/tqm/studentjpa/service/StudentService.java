package com.tqm.studentjpa.service;

import com.tqm.studentjpa.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getListStudent();

    void createNewStudent(Student student) throws Exception;

    void deleteStudentById(Long id) throws Exception;
}
