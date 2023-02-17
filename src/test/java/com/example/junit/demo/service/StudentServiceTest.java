package com.example.junit.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.junit.demo.model.Student;
import com.example.junit.demo.service.impl.StudentServiceImpl;

@ExtendWith(value= {MockitoExtension.class})
public class StudentServiceTest {

	@Spy
	StudentServiceImpl studentServiceImpl;
	
	@Test
	public void testFetchByStudentId() {
		Student student=studentServiceImpl.fetchByStudentId("1");
		System.out.println("student : "+student);
	}
}
