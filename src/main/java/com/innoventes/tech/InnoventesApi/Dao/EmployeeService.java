package com.innoventes.tech.InnoventesApi.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.innoventes.tech.InnoventesApi.Entity.Address;
import com.innoventes.tech.InnoventesApi.Entity.Employee;

@Repository
@Transactional
public class EmployeeService {

	@PersistenceContext
	private EntityManager entityManager;

	public void deleteEmployee(Long id) {
		Employee emp = entityManager.find(Employee.class, id);
		entityManager.remove(emp);
		for (Address a : emp.getAddress()) {
			a.getEmployee().remove(emp);
		}

	}

}
