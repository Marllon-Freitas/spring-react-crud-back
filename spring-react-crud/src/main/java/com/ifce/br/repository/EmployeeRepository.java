package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
