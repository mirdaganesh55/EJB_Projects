package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class PatientBean
 */
@Stateless
@Remote(PatientBeanRemote.class)
public class PatientBean implements PatientBeanRemote {

	@PersistenceContext(unitName = "PatMgmtPU")
	 private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public PatientBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Patient> showPatient() {
		System.out.println("Entity Manager is "+entityManager);
		Query query = entityManager.createQuery("SELECT p FROM Patient p");
		return (List<Patient>) query.getResultList();		
	}

}
