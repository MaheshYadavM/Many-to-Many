package many.to.many.mapping.service;

import java.util.List;
import java.util.Optional;

import many.to.many.mapping.entity.Employee;
import many.to.many.mapping.entity.EmployeeRole;

public interface EmployeeService {
    Employee employeeSave(Employee employee);
    public List<Employee> getAllEmployee();
    public Optional<Employee> getFindById(int id);
    public void DeleteById(Employee employee);
    public Employee updateEmployee(Employee employee );
    
}
