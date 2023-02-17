package com.example.junit.demo.service;

import java.util.List;

import com.example.junit.demo.model.Student;
import com.example.junit.demo.request.StdentDto;
// External Service - Lets say this comes from WunderList
public interface StudentService {

	Student saveStduent(StdentDto stdentDto);
	
	List<Student> fetchAll();
	
	Student updateStudent(StdentDto stdentDto,String Id);
	
	Student fetchByStudentId(String Id);
	
	Student fetchByStudentName(String name);
}
