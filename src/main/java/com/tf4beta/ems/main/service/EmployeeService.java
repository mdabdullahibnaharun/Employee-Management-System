package com.tf4beta.ems.main.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.tf4beta.ems.main.dao.EmployeeDao;
import com.tf4beta.ems.main.entity.Employee;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> findAll() {

		return employeeDao.findAll();
	}

	public Employee findById(int theId) {

		Employee employee = employeeDao.findById(theId);

		return employee;
	}

	public void save(Employee theEmployee) {

		employeeDao.save(theEmployee);

	}

	public void update(Employee theEmployee) {

		employeeDao.update(theEmployee);
	}

	public void deleteById(int theId) {

		employeeDao.delete(theId);
	}

	public List<Employee> searchByName(String searchName) {

		List<Employee> allEmployees = employeeDao.findAll();
		List<Employee> foundEmployees = new ArrayList<>();
		
		for(Employee employee : allEmployees) {
			
			String fname = employee.getFirstName();
			String lname = employee.getLastName();
			
			if ( (fname.toLowerCase().contains(searchName)) || (lname.toLowerCase().contains(searchName)) ){
				foundEmployees.add(employee);
			}
		}
		return foundEmployees;
	}

}