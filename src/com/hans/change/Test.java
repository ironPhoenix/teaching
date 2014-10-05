package com.hans.change;

public class Test {

	public static void main(String[] args) {

		int i = 1;
		long j = 1;
		// i = j;
		j = i;
		Car car = new Car();
		Benz benz = new Benz();
		car = benz;
		// benz = car;
		
		Cat cat = (Cat) car;

		double d = 12.0;
		// float f = 1.0;
		// f = 1;
		d = 1;
	}

}
