package com.example.springdatarest.department.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
