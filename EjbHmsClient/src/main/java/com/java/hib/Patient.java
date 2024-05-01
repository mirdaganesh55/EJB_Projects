package com.java.hib;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="Patient")

public class Patient implements Serializable{
		
	private String pId;
	@Id
	@GeneratedValue
	@Column(name="pId")
	
	private String name;
	@Column(name="name")
	
	private String gender;
	@Column(name="gender")
	
	private String address;
	@Column(name="address")
	
	private String phoneNo;
	@Column(name="phoneNo")
	
	private String disease;
	@Column(name="disease")
	
	private String doctorId;
	@Column(name="doctorId")
	
	private String userName;
	@Column(name="userName")
	
	private String password;
	@Column(name="password")
	
	private String status;
	@Column(name="status")
	
	private String otp;
	@Column(name="otp")
	
	private int age;
	@Column(name="age")
	
	private int weight;
	@Column(name="weight")
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Patient(String pId, String name, String gender, String address, String phoneNo, String disease,
			String doctorId, String userName, String password, String status, String otp, int age, int weight) {
		super();
		this.pId = pId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.disease = disease;
		this.doctorId = doctorId;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.otp = otp;
		this.age = age;
		this.weight = weight;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", name=" + name + ", gender=" + gender + ", address=" + address + ", phoneNo="
				+ phoneNo + ", disease=" + disease + ", doctorId=" + doctorId + ", userName=" + userName + ", password="
				+ password + ", status=" + status + ", otp=" + otp + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
}
