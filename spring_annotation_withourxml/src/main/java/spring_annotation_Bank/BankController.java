	package spring_annotation_Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankController {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BankConfig.class);
//		Person person=context.getBean("person",Person.class);
////		person.bank();
//		Person person1=context.getBean("person",Person.class);
//		System.out.println(person);
//		System.out.println(person1);
	}
}
