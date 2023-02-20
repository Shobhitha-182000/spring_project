package spring_annotation_Animal;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lion eat meat");
	}

}
