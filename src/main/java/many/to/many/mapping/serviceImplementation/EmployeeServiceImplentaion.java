package many.to.many.mapping.serviceImplementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import many.to.many.mapping.entity.Employee;
import many.to.many.mapping.entity.EmployeeRole;
import many.to.many.mapping.repositary.EmployeeRepositary;
import many.to.many.mapping.service.EmployeeService;

@Service
public class EmployeeServiceImplentaion implements EmployeeService {

	@Autowired
	private EmployeeRepositary employeeRepositary;

	@Override
	public Employee employeeSave(Employee employee) {
		/*
		 * Employee employee1 = new Employee();
		 * employee1.setUserName(employee.getUserName());
		 * employee1.setPassword(employee.getPassword());
		 * 
		 * List<EmployeeRole> employeeRole1 = new ArrayList<>();
		 * 
		 * for (EmployeeRole erole : employee.getEmployeeRoles()) { EmployeeRole
		 * employeeRole2 = new EmployeeRole(); employeeRole2.setId(erole.getId());
		 * employeeRole2.setName(erole.getName()); employeeRole1.add(employeeRole2); }
		 * employee1.setEmployeeRoles(employeeRole1);
		 */
		for(int i=0;i<=employee.getId();i++) {
			 employeeRepositary.save(employee);
		}
		 
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepositary.findAll();
	}

	@Override
	public Optional<Employee> getFindById(int id) {
		
		return employeeRepositary.findById(id);
	}

	@Override
	public void DeleteById(Employee employee) {
		 employeeRepositary.delete(employee);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee employee1=new Employee();
		employee1=employeeRepositary.findById(employee.getId()).orElseThrow();
		employee.setId(employee.getId());
		employee.setemployeeName(employee.getemployeeName());
		employee.setPassword(employee.getPassword());
		
	
    List<EmployeeRole> emprole=new ArrayList<>();		
	for(EmployeeRole role:employee.getEmployeeRoles()) {
		EmployeeRole employeeRole=new EmployeeRole();
		employeeRole.setId(role.getId());
		employeeRole.setempRole(role.getempRole());
		emprole.add(employeeRole);
	}
		employee.setEmployeeRoles(emprole);
		
		
		return employeeRepositary.save(employee);
	}

}
