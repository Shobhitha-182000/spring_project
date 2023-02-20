package spring_annotation_Bank;

import org.springframework.stereotype.Component;

@Component
public class ICIC implements BankAccount {

	public void balance() {
		// TODO Auto-generated method stub
			System.out.println("icic balance is 100");
	}

}
