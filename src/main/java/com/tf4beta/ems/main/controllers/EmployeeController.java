package com.tf4beta.ems.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tf4beta.ems.main.entity.Employee;
import com.tf4beta.ems.main.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/index")
	public String employeeIndex() {

		return "employees/employee-index.html";
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		List<Employee> theEmployees = employeeService.findAll();
		
		theModel.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}

	@RequestMapping("/showEmployeeDetails")
	public String viewEmploye(@RequestParam("employeeId") int theId, Model model) {
		
		Employee employee = employeeService.findById(theId);
		
		model.addAttribute("employee", employee);
		
		return "employees/employee-view";
	}

	@GetMapping("/searchByName")
	public String searchByName(@RequestParam("searchName") String searchName, Model model) {

		List<Employee> theEmployees = employeeService.searchByName(searchName);

		model.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Employee employee = new Employee();
		
		theModel.addAttribute("employee", employee);

		return "employees/employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		
		Employee employee = employeeService.findById(theId);

		theModel.addAttribute("employee", employee);

		return "employees/employee-updateform";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		employeeService.save(employee);
		
		return "redirect:/employees/list";
	}

	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.update(employee);
		return "redirect:/employees/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		employeeService.deleteById(theId);
		return "redirect:/employees/list";
	}
}