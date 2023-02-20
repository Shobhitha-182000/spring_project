package spring_annotation_mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	Sim sim;
	public void insertSim() {
		sim.insertedMobile();
	}
}
