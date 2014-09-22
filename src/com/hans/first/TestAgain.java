package com.hans.first;

public class TestAgain {

	public static void main(String[] args) {
		String s1 = "string";
		String s2 = "string";
		System.out.println(s1.equals(s2));
		Benz b1 = new Benz();
		Benz b2 = new Benz();
		System.out.println(b1.equals(b2));
		b1.setType("S600");
		b2.setType("S600");
		System.out.println(b1.equals(b2));
		b1 = b2;
		System.out.println(b1.equals(b2));

	}

}
