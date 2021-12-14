package com.tf4beta.ems.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tf4beta.ems.main.entity.Employee;
import com.tf4beta.ems.main.rowmapper.EmployeeRowMapper;


@Repository
@Transactional
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {
		String sql = "INSERT INTO employee ( address, email, firstname, framework, lastname, phone, salary , joiningdate, retireddate) VALUES (?, ?, ?, ?, ?, ?,?,?,?)";
		
		jdbcTemplate.update(sql,employee.getAddress(),employee.getEmail(),employee.getFirstName(),employee.getFramework(),employee.getLastName(),employee.getPhone(),employee.getSalary(),employee.getJoiningdate(),employee.getRetireddate());
	}

	public void delete(int id) {
		String sql = "DELETE FROM employee WHERE id = " + id;
		jdbcTemplate.update(sql);
	}
	
	public void update(Employee employee) {
		String sql = "UPDATE employee SET  address = ?, email = ?, firstname = ?, framework = ?, lastname = ?, phone = ?,salary = ?, joiningdate = ?, retireddate = ? WHERE id = ? ";
		jdbcTemplate.update(sql,employee.getAddress(),employee.getEmail(),employee.getFirstName(),employee.getFramework(),employee.getLastName(),employee.getPhone(),employee.getSalary(),employee.getJoiningdate(),employee.getRetireddate(), employee.getId());
	}

	public Employee findById(int id) {
		String sql = "SELECT * FROM employee WHERE id = ? ";
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
	}

	public List<Employee> findAll() {
		String sql = "SELECT * FROM employee";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
	
	public List<Employee> searchByName(String searchName){
		String sql = "SELECT * FROM employee WHERE firstname LIKE '%" + searchName + "%'  OR lastname LIKE '%" +searchName +"%' ";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
}