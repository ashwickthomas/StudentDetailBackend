package com.sample.studentsystem.Service;

import com.sample.studentsystem.model.Student;
import com.sample.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImple implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);

    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
