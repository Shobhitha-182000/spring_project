package spring_prc_dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myspring.xml");
		Cow cow=context.getBean("cow",Cow.class);
		cow.sound();
	}
}
