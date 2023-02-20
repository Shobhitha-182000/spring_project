package spring_annotation_dto;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
 
public class Person {
	@PostConstruct
	public void stat() {
		System.out.println("first execute");
	}
	public void walk() {
		System.out.println("walk");
	}
}
