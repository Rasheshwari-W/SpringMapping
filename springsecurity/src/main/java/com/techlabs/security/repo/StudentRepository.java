package com.techlabs.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.security.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
