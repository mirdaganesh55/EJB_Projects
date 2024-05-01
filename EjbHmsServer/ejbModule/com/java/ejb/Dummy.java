package com.java.ejb;
// it will come in client only after binding
public class Dummy {
	
	public static void main(String[] args) {
		System.out.println(new PatientBean().showPatient());
	}
	
}
