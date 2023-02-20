package spring_prc_employee_dto.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class EmployeeController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=context.getBean("emp",Employee.class);
		employee.print();
	}
}
