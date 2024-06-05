package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

		@Entity
		@Table(name="emp_tabl")
		public class Employee {
			
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int empId;
		private String empName;
		private Double empSalary;
		private String empGeneder;
		private String dept;
		
		@CreationTimestamp
		@Column(name="date_created",updatable=false) 
		private LocalDate dateCreated;
		@UpdateTimestamp
		@Column(name="last_updated", insertable=false)
		private LocalDate lastUpdated;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpGeneder() {
	return empGeneder;
}
public void setEmpGeneder(String empGeneder) {
	this.empGeneder = empGeneder;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Employee(Integer empId, String empName, Double empSalary, String empGeneder, String dept) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empGeneder = empGeneder;
	this.dept = dept;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGeneder="
			+ empGeneder + ", dept=" + dept + "]";
}


	
}
