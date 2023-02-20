package spring_item_prc.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
//		Pen p=context.getBean("pen",Pen.class);
//		p.used();
//		System.out.println("pen price is"+p.price);
		Item item= context.getBean("pen",Pen.class);
		item.used();
		System.out.println();
		 
	}
} 