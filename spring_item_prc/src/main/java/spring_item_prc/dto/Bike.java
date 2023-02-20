package spring_item_prc.dto;

import org.springframework.stereotype.Component;



public class Bike implements Item {

	@Override
	public void used() {
		 System.out.println("to ride");

	}

}
