package com.example.junit.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junit.demo.model.Student;
import com.example.junit.demo.repository.StudentRepository;
import com.example.junit.demo.request.StdentDto;
import com.example.junit.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStduent(StdentDto stdentDto) {
		System.out.println(studentRepository);
		return studentRepository.save(Student.builder().studentId(stdentDto.getStudentId())
				.studentName(stdentDto.getStudentName()).studentFees(stdentDto.getStudentFees()).build());
	}

	@Override
	public List<Student> fetchAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(StdentDto stdentDto, String Id) {
		Student student=studentRepository.findByStudentId(Id);
		student.setStudentFees(stdentDto.getStudentFees());
		student.setStudentName(stdentDto.getStudentName());
		return student;
	}

	@Override
	public Student fetchByStudentId(String Id) {
		return studentRepository.findByStudentId(Id);
	}

	@Override
	public Student fetchByStudentName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
