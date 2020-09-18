package com.innoventes.tech.InnoventesApi.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.tech.InnoventesApi.Dao.EmployeeDaoService;
import com.innoventes.tech.InnoventesApi.Dao.EmployeeRepository;
import com.innoventes.tech.InnoventesApi.Entity.Employee;

@Service
public class InnoventesService {

	@Autowired
	private EmployeeDaoService employeeDaoService;
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	public Employee createEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getById(Long id) {
		return employeeRepository.findById(id).get();
	}

	public void deleteEmployeeById(Long id) {
		employeeDaoService.deleteEmployee(id);
	}

	public Boolean updateEmployee(Employee employee, Long id) {
		if (employeeRepository.findById(id).isPresent()) {
			Optional<Employee> emp = employeeRepository.findById(id);
			Employee empl = emp.get();

			empl.setEmpId(id);
			if (employee.getName() != null) {
				empl.setName(employee.getName());
			}
			if (employee.getDateOfBirth() != null) {
				empl.setDateOfBirth(employee.getDateOfBirth());
			}
			employeeRepository.save(empl);
			return true;
		}
		return false;
	}

	public Employee getEmployeeByName(String name) {
		return employeeRepository.findAllByName(name);

	}

}
