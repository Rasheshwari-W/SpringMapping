package com.techlabs.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.security.entity.Student;
import com.techlabs.security.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public boolean addStudent(Student student) {
		
		studentRepo.save(student);
		return true;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

}
