package spring_annotation_Bank;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Person {
	@Autowired 
	@Qualifier("HDFC")
	BankAccount account;
	@PostConstruct
	public void stat() {
		System.out.println("first execute");
	}
	public void bank() {
		account.balance();
	}
}
