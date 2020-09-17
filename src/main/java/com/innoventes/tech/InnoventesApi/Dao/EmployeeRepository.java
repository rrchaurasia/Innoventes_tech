package com.innoventes.tech.InnoventesApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.tech.InnoventesApi.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long > {


}
