package com.hans.first;

public class Test {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println(i == j);
		String s1 = "string";
		String s2 = "string";
		System.out.println(s1 == s2);
		Benz b1 = new Benz();
		Benz b2 = new Benz();
		System.out.println(b1 == b2);
		b1.setType("S600");
		b2.setType("S600");
		System.out.println(b1 == b2);
		b1 = b2;
		System.out.println(b1 == b2);
	}
}
