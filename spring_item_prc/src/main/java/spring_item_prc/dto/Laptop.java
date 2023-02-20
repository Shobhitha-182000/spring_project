package spring_item_prc.dto;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Item {

	@Override
	public void used() {
		 System.out.println("to play");

	}

}
