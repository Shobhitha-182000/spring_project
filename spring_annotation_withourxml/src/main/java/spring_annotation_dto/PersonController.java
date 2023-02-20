package spring_annotation_dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_annotation_Bank.Person;

public class PersonController {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
//		Person person=context.getBean("person",Person.class);
//		Person person1=context.getBean("person",Person.class);
//		System.out.println(person);
//		System.out.println(person1);
	}
}
