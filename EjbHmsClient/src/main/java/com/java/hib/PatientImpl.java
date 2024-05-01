package com.java.hib;


import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PatientImpl {
	
	SessionFactory sf;
	Session session;
	
	public static String generateOtp() {
		int len=10;
		  String AlphaNumericString = "0123456789"
			         + "abcdefghijklmnopqrstuvxyz";
			  StringBuilder sb = new StringBuilder(len);
			  for (int i=0;i<len;i++) {
			   int index = (int)(AlphaNumericString.length()
			      * Math.random());
			   sb.append(AlphaNumericString
			      .charAt(index));
			  }
			  return sb.toString();
	}
	public String sendOtp(Patient patient) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		String otp = generateOtp();
		Transaction trans = session.beginTransaction();
		patient.setOtp(otp);
		session.save(patient);
		System.out.println(patient);
		String body ="Welcome to Mr/Miss  " +patient.getName() + "\r\n"+
				"Your OTP Generated Successfully..." +"\r\n" + 
				"OTP is " +otp;
		MailSend.mailOtp(patient.getUserName(), "Otp Send Succesfully...", body);
		System.out.println("Before trans Otp called "+otp);
		trans.commit();
		System.out.println(patient);
		System.out.println("After Trans " +otp);
		return "CreatePassword.jsp?faces-redirect=true";	
	}

	public String validateOtp(Patient patient) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("otp",patient.getOtp()));
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		String otp=(String)
		String otp2=generateOtp();
		System.out.println("Before Count " +count);
		System.out.println(patient);
		if(count==otp2) {
			System.out.println("After Count" +count);
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			cr = session.createCriteria(Patient.class);
			Transaction trans = session.beginTransaction();
			System.err.println(patient.getStatus());
			patient.setStatus("Active");
			session.update(patient);
			System.out.println(patient);
			trans.commit();
			System.out.println("Count Executed...");
		}
			return "Invalid OTP";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
