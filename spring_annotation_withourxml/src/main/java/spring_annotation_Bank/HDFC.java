package spring_annotation_Bank;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements BankAccount {

	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("hdfc bank baance is 1000");
	}

}
