package com.tf4beta.ems.main.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tf4beta.ems.main.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setFirstName(rs.getString("firstname"));
		employee.setAddress(rs.getString("address"));
		employee.setLastName(rs.getString("lastname"));
		employee.setEmail(rs.getString("email"));
		employee.setFramework(rs.getString("framework"));
		employee.setPhone(rs.getString("phone"));
		employee.setSalary(rs.getString("salary"));
		employee.setJoiningdate(rs.getString("joiningdate"));
		employee.setRetireddate(rs.getString("retireddate"));
		return employee;
	}

}
