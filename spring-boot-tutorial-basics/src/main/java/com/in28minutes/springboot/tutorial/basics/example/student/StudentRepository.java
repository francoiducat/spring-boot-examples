package com.in28minutes.springboot.tutorial.basics.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	public List<Student> findStudentByName(String name);
}
