package constructor_injector_student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor_student.xml");
		Student student=context.getBean("std",Student.class);
		System.out.println(student.getName());
		System.out.println(student.getPhone());
		System.out.println(student.getAddress());
		
	}
}
