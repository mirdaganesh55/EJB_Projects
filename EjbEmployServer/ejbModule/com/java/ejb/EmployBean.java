package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(EmployBeanRemote.class)
public class EmployBean implements EmployBeanRemote {

	
	 @PersistenceContext(unitName = "EmpMgmtPU")
	 private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public EmployBean() {
        // TODO Auto-generated constructor stub
    }
// step 1... add unimplemented methods......
	@Override
	public List<Employ> showEmploy() {
		System.out.println("Entity Manager is "+entityManager);
		Query query = entityManager.createQuery("SELECT e FROM Employ e");
		return (List<Employ>) query.getResultList();
	}
	// step 2... add unimplemented methods......
	@Override
	public Employ searchEmploy(int empno) {
		Employ employee = entityManager.find(Employ.class, empno);
		return employee;
	}
	
	@Override
	public String deleteEmployee(int id) {
		Employ employeeFound = searchEmploy(id);
		if (employeeFound!=null) {
			entityManager.remove(employeeFound);
			return "Record Deleted...";
		} 
		return "Not Found";
	}
	@Override
	public String updateEmployee(Employ employeeNew) {
		Employ employeeFound = searchEmploy(employeeNew.getEmpno());
		if (employeeFound!=null) {
			entityManager.merge(employeeNew);
			return "Employee Record Updated...";
		}
		return "Not Found...";

	}
	@Override
	public String addEmployee(Employ employ) {
		entityManager.persist(employ);
		return "Employ Record Inserted...";
	}
	

}
//persist - save
//merge - update
//remove - delete
//