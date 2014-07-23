package org.spring.orm.service;

import org.spring.orm.model.Employee;

public interface IEmployeeService {

	void persistEmployee(Employee employee);

	Employee findEmployeeById(String id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}