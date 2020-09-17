package com.innoventes.tech.InnoventesApi.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.innoventes.tech.InnoventesApi.Dao.EmployeeDaoService;
import com.innoventes.tech.InnoventesApi.Dao.EmployeeRepository;
import com.innoventes.tech.InnoventesApi.Entity.Employee;

@RestController
public class InnoventesResource {
	
	
	@Autowired
	private EmployeeDaoService employeeDaoService;
	@Autowired
	private EmployeeRepository employeeRepository;

	// Get the List of employee
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	// Create new employee
	@PostMapping("/create/employee")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee employee) {

		Employee saveEmployee = employeeRepository.save(employee);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{Id}").buildAndExpand(saveEmployee.getEmpId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	// Get Employee by id
	@GetMapping("/employee/{id}")
	public Optional<Employee> getById(@PathVariable Long id) {
		return employeeRepository.findById(id);
	}

	// delete Employee by id
	@DeleteMapping("/delete/employee/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {
		employeeDaoService.deleteEmployee(id);
	}

	// update employee
	@PutMapping("/update/employee/{id}")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		if (!emp.isPresent())
			return ResponseEntity.notFound().build();

		employee.setEmpId(id);
		employeeRepository.save(employee);

		return ResponseEntity.ok().build();

	}
	
	/*
	 * // Create new employee
	 * 
	 * @PostMapping("/create/employeeDetails") public
	 * ResponseEntity<EmployeeAddress> createEmp(@RequestBody EmployeeAddress
	 * employeeAddress) {
	 * 
	 * EmployeeAddress saveEmployee = employeeRepository.save(employeeAddress); URI
	 * uri =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{Id}").buildAndExpand
	 * (saveEmployee.getId()) .toUri(); return ResponseEntity.created(uri).build();
	 * }
	 */
}
