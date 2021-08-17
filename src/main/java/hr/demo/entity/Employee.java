package hr.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
	@Id
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME")
	private String name;
	@Column(name = "SALARY")
	private double salary;

	@ManyToOne
	@JoinColumn(name = "EMP_DEPT_ID", referencedColumnName = "DEPT_ID")
	private Department d;

	public Employee() {
		d = new Department();
	}

	public Employee(int id, String name, double salary, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptInfo=" + d + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}



}

