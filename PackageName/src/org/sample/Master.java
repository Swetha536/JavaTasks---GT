package org.sample;
import org.base.Company;

public class Master {
	private void masterId() {
		System.out.println("m123");
		 

	}
	private void masterName() {
		System.out.println("SSS");
		 

	}
	public static void main(String[] args) {
		Master m = new Master();
		m.masterId();
		m.masterName();
		Company c = new Company();
		c.compId();
		c.compName();
	}

}
