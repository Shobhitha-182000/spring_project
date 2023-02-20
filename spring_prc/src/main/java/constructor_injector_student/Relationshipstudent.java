package constructor_injector_student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Relationshipstudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor_school.xml");
		School school=context.getBean("school",School.class);
		Student student=school.getStudent();
		System.out.println("School name is "+school.getName());
		System.out.println("Student name is "+student.getName());
	}
}
