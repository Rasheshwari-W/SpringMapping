package com.techlabs.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.security.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
