package hr.demo.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="DEPARTMENT")
public class Department implements Serializable {
	@Id @Column(name="DEPT_ID")
	private int id;
	@Column(name="DEPT_NAME")
	private String deptname;
	@Column(name="LOCATION")
	private String location;
	
	public Department() {
		super();
	}

	public Department(int id, String deptname, String location) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptname=" + deptname + ", location=" + location + "]";
	}

}
