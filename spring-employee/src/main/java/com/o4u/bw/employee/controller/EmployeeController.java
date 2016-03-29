package com.o4u.bw.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.o4u.bw.employee.model.Employee;
import com.o4u.bw.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Log LOGGER = LogFactory.getLog(EmployeeController.class); 
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("employees")
	public String list(Model model){
		
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("Request EmployeeController : list()");
		}
		
		List<Employee> employees = employeeService.getEmployeeList(); 
		
		model.addAttribute("employees", employees);
		
		return "employee/list";
	}
	
	@RequestMapping(value="employee/add", method=RequestMethod.GET)
	public String addForm(Model model){
		model.addAttribute("employee", new Employee());
		
		return "employee/add";
	} 
	
	@RequestMapping(value="employee/add", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug(bindingResult);
			}
			return "employee/add";
		}
		
		employeeService.insertEmployee(employee);
		
		return "redirect:/employees";
	} 
	
	@RequestMapping(value="employee/{id}")
	public String view(@PathVariable String id, Model model){
		
		Employee employee = new Employee();
		employee.setId(id);
		
		employee = employeeService.getEmployee(employee);
		
		model.addAttribute("employee", employee);
		
		return "employee/view";
	}
	
	@RequestMapping(value="employee/{id}/modify", method=RequestMethod.GET)
	public String modifyForm(@PathVariable String id, Model model){
		
		Employee employee = new Employee();
		employee.setId(id);
		
		employee = employeeService.getEmployee(employee);
		
		model.addAttribute("employee", employee);
		
		return "employee/modify";
	}
	
	@RequestMapping(value="employee/modify", method=RequestMethod.POST)
	public String modify(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug(bindingResult);
			}
			return "employee/modify";
		}
		
		employeeService.updateEmployee(employee);
		
		return "redirect:/employee/" + employee.getId();
	} 
	
	@RequestMapping(value="employee/{id}/delete", method=RequestMethod.GET)
	public String delete(@PathVariable String id){
		
		Employee employee = new Employee();
		employee.setId(id);
		
		employeeService.deleteEmployee(employee);
		
		return "redirect:/employees";
	}
}
