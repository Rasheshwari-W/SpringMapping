package com.techlabs.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.security.entity.Student;
import com.techlabs.security.service.StudentService;

@RestController
@RequestMapping("/studentapp")
@CrossOrigin(origins = "http://localhost:3000/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	//@PreAuthorize("hasRole('ADMIN')")	
	public ResponseEntity<Boolean> addStudent(@RequestBody Student student)
	{
		
		return ResponseEntity.ok(studentService.addStudent(student));
	}
	
	@GetMapping("/students")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		
		return ResponseEntity.ok(studentService.getAllStudents());
	}
	
	

}
