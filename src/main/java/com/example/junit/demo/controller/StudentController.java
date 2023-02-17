package com.example.junit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junit.demo.model.Student;
import com.example.junit.demo.request.StdentDto;
import com.example.junit.demo.service.StudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	@PostMapping("/save")
	public Student  saveStudent(@RequestBody StdentDto stdentDto){
		return studentService.saveStduent(stdentDto);
		
	}
	
	@PostMapping("/update")
	public Student  updateStudent(@RequestBody StdentDto stdentDto,@PathVariable String Id){
		return studentService.updateStudent(stdentDto, Id);
		
	}
	
	@GetMapping("/get")
	public Student  getByStudentId(@PathVariable String Id){
		return studentService.fetchByStudentId(Id);
		
	}
	
	@GetMapping("/get/All")
	public List<Student>  getByAllStudentId(){
		return studentService.fetchAll();
		
	}
}
