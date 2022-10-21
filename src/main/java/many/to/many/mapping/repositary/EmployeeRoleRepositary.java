package many.to.many.mapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import many.to.many.mapping.entity.EmployeeRole;

public interface EmployeeRoleRepositary extends JpaRepository<EmployeeRole, Integer>{

}
