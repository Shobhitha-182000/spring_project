package spring_annotation_mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
	Mobile mobile=context.getBean("mobile",Mobile.class);
	mobile.insertSim();
}
}
