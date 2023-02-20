package spring_controller_person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_person_prc_annotation.Person;

public class PersonController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		Person p=context.getBean("person", Person.class);
		p.walk();
		System.out.println(p.getAge());
	}
}
