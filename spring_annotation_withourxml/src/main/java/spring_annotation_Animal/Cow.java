package spring_annotation_Animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cow implements Animal {

	public void eat() {
		 System.out.println("cow eat grassn");

	}

}
