package com.javatechie.dao;

import com.javatechie.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>, JpaRepository<Employee, Integer>, CrudRepository<Employee, Integer> {
}