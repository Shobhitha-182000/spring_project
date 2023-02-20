package spring_annotation_Bank;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements BankAccount {

	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("SBI balance is 1000000");
	}

}
