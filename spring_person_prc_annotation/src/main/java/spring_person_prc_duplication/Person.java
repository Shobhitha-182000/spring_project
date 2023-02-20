package spring_person_prc_duplication;

import org.springframework.stereotype.Component;

@Component
public class Person {
	public void talk() {
		System.out.println("talk");
	}
}
