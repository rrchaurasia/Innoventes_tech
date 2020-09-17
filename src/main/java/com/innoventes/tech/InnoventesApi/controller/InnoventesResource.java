package com.innoventes.tech.InnoventesApi.controller;

import java.net.URI;
import java.util.List;

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

import com.innoventes.tech.InnoventesApi.DaoImpl.InnoventesService;
import com.innoventes.tech.InnoventesApi.Entity.Employee;

@RestController
public class InnoventesResource {

	@Autowired
	private InnoventesService innoventesService;

	// Get the List of employee
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return innoventesService.getEmployees();
	}

	// Create new employee
	@PostMapping("/create/employee")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee employee) {

		Employee saveEmployee = innoventesService.createEmp(employee);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{Id}").buildAndExpand(saveEmployee.getEmpId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	// Get Employee by id
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable Long id) {
		return innoventesService.getById(id);
	}

	// delete Employee by id
	@DeleteMapping("/delete/employee/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {
		innoventesService.deleteEmployeeById(id);
	}

	// update employee
	@PutMapping("/update/employee/{id}")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		Boolean b = innoventesService.updateEmployee(employee, id);
		if (b)
			return ResponseEntity.ok().build();
		return ResponseEntity.noContent().build();

	}

	// Get Employee By name
	@GetMapping("/getEmployee/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {

		return innoventesService.getEmployeeByName(name);

	}
}
