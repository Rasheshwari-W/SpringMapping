package com.techlabs.security.service;

import java.util.List;

import com.techlabs.security.entity.Student;

public interface StudentService {
	
	boolean addStudent(Student student);
	List<Student> getAllStudents();

}
