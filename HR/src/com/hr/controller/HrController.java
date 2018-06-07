package com.hr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hr.beans.Employee;

@Controller
public class HrController {
	
	@Autowired
	private Employee employee;
	
	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	@RequestMapping("/Show-Employee")
	public String showEmployee(Model model) {
		model.addAttribute("employee", this.employee);
		return "show_employee";
	}
	@RequestMapping("/Show-Employee-Database")
	public String showEmployeeDatabase(Model model) {
		List<Employee> list = employee.getEmployee();
		model.addAttribute("list",list);
		return "show_employee-database";
	}
	@RequestMapping(value="/Show-Employee-Details")
	public String showEmployeeDetails(Model model,@RequestParam("id") String id) {
		Employee e = employee.getSingleEmployee(Integer.parseInt(id));
		model.addAttribute("e", e);
		return "show_employee_details";
	}
	
	@RequestMapping("/Add-Employee")
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "add_employee";
	}
	
	@RequestMapping(value="/Insert-Employee", method=RequestMethod.POST)
	public String insertEmployee(Model model, @Valid Employee e, BindingResult result) {
		if(result.hasErrors()) {
			return"add_employee";
		}
		employee.createEmployee(e);
		model.addAttribute("e", e);
		return "index";
	}
}
