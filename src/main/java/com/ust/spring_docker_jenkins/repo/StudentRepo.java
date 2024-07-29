package com.ust.spring_docker_jenkins.repo;

import com.ust.spring_docker_jenkins.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<Student,Integer> {
}
