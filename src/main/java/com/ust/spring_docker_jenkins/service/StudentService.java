package com.ust.spring_docker_jenkins.service;

import com.ust.spring_docker_jenkins.model.Student;
import com.ust.spring_docker_jenkins.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }
}
