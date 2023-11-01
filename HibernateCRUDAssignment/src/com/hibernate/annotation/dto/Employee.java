package com.hibernate.annotation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
	public class Employee {
		@Id
		@Column(name="E_empid")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int empid;
		@Column(name="E_empname")
		private String EmpName;
		@Column(name="E_email")
		private String EmpEmail;
		@Column(name="E_mobile")
		private String EmpMobileNo;
		@Column(name="E_age")
		private int EmpAge;
		@Column(name="E_salary")
		private int EmpSalary;
		@Column(name="E_state")
		private String EmpState;
		 //getter and setter methods
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		public String getEmpEmail() {
			return EmpEmail;
		}
		public void setEmpEmail(String empEmail) {
			EmpEmail = empEmail;
		}
		public String getEmpMobileNo() {
			return EmpMobileNo;
		}
		public void setEmpMobileNo(String empMobileNo) {
			EmpMobileNo = empMobileNo;
		}
		public int getEmpAge() {
			return EmpAge;
		}
		public void setEmpAge(int empAge) {
			EmpAge = empAge;
		}
		public int getEmpSalary() {
			return EmpSalary;
		}
		public void setEmpSalary(int empSalary) {
			EmpSalary = empSalary;
		}
		public String getEmpState() {
			return EmpState;
		}
		public void setEmpState(String empState) {
			EmpState = empState;
		}
}
		