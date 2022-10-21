package many.to.many.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import many.to.many.mapping.entity.Employee;
import many.to.many.mapping.entity.EmployeeRole;
import many.to.many.mapping.service.EmployeeService;

@RestController
public class EmployeeController {
   
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("saveEmployee")
	public Employee saveEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.employeeSave(employee);
	}
	@GetMapping("all")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();
		
	}
	@GetMapping("ID")
	public Optional<Employee> getById(@RequestParam int id){
		return employeeService.getFindById(id);
	}
	@DeleteMapping("delete")
	public ResponseEntity<String> delete(@RequestParam int id,Employee employee){
		employeeService.DeleteById(employee);
		return new ResponseEntity<String>(" Employee "+id+" details deleted ",HttpStatus.ACCEPTED);
	}
	@PutMapping("update")
	public Employee updateEmploye(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
}
