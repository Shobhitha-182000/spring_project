package constructor_injector_student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor_school.xml");
		School school=context.getBean("school",School.class);
		System.out.println(school.getName());
		System.out.println(school.getFees());
		System.out.println(school.getAddress());
	}
	 

}
