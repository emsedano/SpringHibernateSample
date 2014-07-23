package org.spring.orm.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.spring.orm.model.Employee;


@Repository("employeeDAO")
public class EmployeeDAO implements IEmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void persistEmployee(Employee employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	public Employee findEmployeeById(String id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);

	}

	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}

}