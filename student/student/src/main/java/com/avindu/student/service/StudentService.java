package com.avindu.student.service;

import com.avindu.student.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent (Student student);
    public List<Student> getAllStudents();


}