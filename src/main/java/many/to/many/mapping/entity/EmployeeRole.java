package many.to.many.mapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empRole;

	public EmployeeRole(int id, String empRole) {
		super();
		this.id = id;
		this.empRole = empRole;
	}

	public EmployeeRole() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getempRole() {
		return empRole;
	}

	public void setempRole(String empRole) {
		this.empRole = empRole;
	}

}
