package org.spring.orm.model.dao;

import org.spring.orm.model.Employee;

public interface IEmployeeDAO {
	
	 void persistEmployee(Employee employee);
	  
	 Employee findEmployeeById(String id);
	  
	 void updateEmployee(Employee employee);
	  
	 void deleteEmployee(Employee employee);
}
