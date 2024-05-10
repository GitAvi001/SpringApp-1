package com.avindu.student.controller;

import com.avindu.student.model.Student;
import com.avindu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin //Will solve the errors in the connectivity
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);

        return "new Student added";
    }

    @GetMapping("./getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();

    }
}
