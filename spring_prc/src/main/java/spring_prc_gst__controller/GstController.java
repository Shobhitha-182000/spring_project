package spring_prc_gst__controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_prc_gst_dto.GoodsAndServices;
import spring_prc_gst_dto.KarnatakaGst;
import spring_prc_gst_dto.TamilnaduGst;

public class GstController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("gst.xml");
		GoodsAndServices goodsAndServices=context.getBean("tn",TamilnaduGst.class);
		goodsAndServices.calculate();
	}
}
