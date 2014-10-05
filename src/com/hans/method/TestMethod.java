package com.hans.method;

public  class TestMethod {

	public static void main(String[] args) {
		TestMethod tm = new TestMethod();
//		int id = 1;
//		String name = "name";
//		System.out.println(id);
//		System.out.println(name);
//		tm.change1(id, name);
//		System.out.println(id);
//		System.out.println(name);
		Car car = new Car();
		System.out.println(car.getId());
		System.out.println(car.getType());
		tm.change2(car);
		System.out.println(car.getId());
		System.out.println(car.getType());
	}

	public void change1(int id, String name) {
		id = 12;
		// name = "asdfa";
		name.toUpperCase();
	}
	public void change2(Car car) {
//		car = new Car();
		car.setId(112);
		car.setType("asdf");
		
	}
}
