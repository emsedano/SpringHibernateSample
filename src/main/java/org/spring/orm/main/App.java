package org.spring.orm.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.spring.orm.model.Employee;
import org.spring.orm.service.IEmployeeService;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee em = new Employee();
		em.setName("John");
		em.setAge(35);
		
		IEmployeeService emService = (IEmployeeService) context.getBean("employeeService");
		emService.persistEmployee(em);
		
		System.out.println("Updated age :" + emService.findEmployeeById("1").getAge());		
		em.setAge(32);
		
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("1").getAge());
		
		emService.deleteEmployee(em);
		context.close();
	}

}