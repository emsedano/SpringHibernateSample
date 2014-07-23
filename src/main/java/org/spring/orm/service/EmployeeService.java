package org.spring.orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.spring.orm.model.Employee;
import org.spring.orm.model.dao.IEmployeeDAO;

@Service("employeeService")
public class EmployeeService implements IEmployeeService{

	@Autowired
	IEmployeeDAO employeeDAO;
	
	@Transactional
	public void persistEmployee(Employee employee) {
		employeeDAO.persistEmployee(employee);
		
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
		
	}
	
	@Transactional
	public Employee findEmployeeById(String id) {
		return employeeDAO.findEmployeeById(id);
	}

	
	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);
		
	}

}