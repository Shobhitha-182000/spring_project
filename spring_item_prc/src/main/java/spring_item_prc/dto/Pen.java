package spring_item_prc.dto;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Item {
	double  price=60;
	@Override
	public void used() {
		 System.out.println("to write");
		 

	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
