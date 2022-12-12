package com.sample.studentsystem.controller;


import com.sample.studentsystem.Service.StudentService;
import com.sample.studentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

@PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
{
    Student studentResponse = new Student();
    studentResponse = studentService.saveStudent(student);
    return new ResponseEntity(studentResponse, HttpStatus.CREATED);

}
@GetMapping("/getstudents")
public ResponseEntity<List<Student>> getStudentList()
{
    return new ResponseEntity (studentService.getStudents(),HttpStatus.ACCEPTED);
}

}
