package com.example.junit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByStudentId(String id);

}
