package myfirstproject.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " spring_project")
public class EmployerRegister {
	
	@Id
	private int eid;
	@Column
	private String org_name;
	@Column
	private String emp_add;
	@Column
	private int emp_contact;
	@Column
	private String emp_email;
	
	

	public EmployerRegister() {
		super();
		
	}
	
	public EmployerRegister(int eid, String org_name, String emp_add, int emp_contact, String emp_email) {
		super();
		this.eid = eid;
		this.org_name = org_name;
		this.emp_add = emp_add;
		this.emp_contact = emp_contact;
		this.emp_email = emp_email;
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getEmp_add() {
		return emp_add;
	}

	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}

	public int getEmp_contact() {
		return emp_contact;
	}

	public void setEmp_contact(int emp_contact) {
		this.emp_contact = emp_contact;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	@Override
	public String toString() {
		return "EmployerRegister [eid=" + eid + ", org_name=" + org_name + ", emp_add=" + emp_add + ", emp_contact="
				+ emp_contact + ", emp_email=" + emp_email + "]";
	}

	
		
	
}