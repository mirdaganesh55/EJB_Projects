package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployBeanRemote {
//	step 1 
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	 String addEmployee(Employ employee);
	 String deleteEmployee(int id);
	  String updateEmployee(Employ employeeNew);
}
