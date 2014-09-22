package com.hans.second;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		car.whistle();
		System.out.println(car.length);
		
		System.out.println("-------------------------------------");
		
		Benz benz = new Benz();
		benz.run();
		benz.whistle();
		benz.show();
		System.out.println(benz.length);
	}
}
