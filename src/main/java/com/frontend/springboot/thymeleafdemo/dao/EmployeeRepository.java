package com.frontend.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frontend.springboot.thymeleafdemo.entity.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// Sorting by last Name
	public List<Employee> findAllByOrderByFirstNameAsc();
	
}
