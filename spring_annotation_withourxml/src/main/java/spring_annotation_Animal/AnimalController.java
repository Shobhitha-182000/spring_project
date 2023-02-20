package spring_annotation_Animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalController {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(AnimalConfig.class);
		Zoo zoo=context.getBean("zoo",Zoo.class);
		zoo.food();
		 
	}
}
