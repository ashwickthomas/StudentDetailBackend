package com.sample.studentsystem.Service;

import com.sample.studentsystem.StudentsystemApplication;
import com.sample.studentsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getStudents();
}
