package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
// step 1
@Entity
@Table(name="Employ")
public class Employ implements Serializable {

//	step 2
	
//	primary key
	
//	data entry or auto increament
	@Id
	@Column(name="empno")	
	private int empno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dept")
	private String dept;
	
	@Column(name="desig")
	private String desig;
	
	@Column(name="basic")
	private double basic;
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employ(int empno, String name, String gender, String dept, String desig, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}
//apply targeted runtime as wildfly...	
//	chagen the password in notepad in standalone.xml file
//	go to manifest after doing this
//	now add ejb.jar.xml and persistence.xml file in META_INF file
	
}
