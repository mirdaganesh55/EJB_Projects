package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployBeanRemote {
//	step 1...
	List<Employ> showEmploy();
//	step 2...
	Employ searchEmploy(int empno);
//	step 3
	String addEmployee(Employ employee);
	String deleteEmployee(int id);
	String updateEmployee(Employ employeeNew);

}
