package many.to.many.mapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import many.to.many.mapping.entity.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Integer> {

}
