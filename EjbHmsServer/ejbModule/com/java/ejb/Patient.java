package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="patient_master")
public class Patient implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="pId")
	private String pId;
	
	@Column(name="name")
	private String name;

	@Column(name="gender")	
	private String gender;

	@Column(name="address")	
	private String address;

	@Column(name="phoneNo")
	private String phoneNo;
	
	@Column(name="disease")
	private String disease;

	@Column(name="doctor_Id")
	private String doctorId;

	@Column(name="userName")
	private String userName;

	@Column(name="password")
	private String passCode;

	@Column(name="status")
	private String status;

	@Column(name="otp")
	private String otp;

	@Column(name="age")
	private int age;

	@Column(name="weight")
	private int weight;
	
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
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
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
			String doctorId, String userName, String passCode, String status, String otp, int age, int weight) {
		super();
		this.pId = pId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.disease = disease;
		this.doctorId = doctorId;
		this.userName = userName;
		this.passCode = passCode;
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
				+ phoneNo + ", disease=" + disease + ", doctorId=" + doctorId + ", userName=" + userName + ", passCode="
				+ passCode + ", status=" + status + ", otp=" + otp + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
}
