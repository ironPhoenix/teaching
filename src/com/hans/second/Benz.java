package com.hans.second;

public class Benz extends Car {
	private String type = "S600";

	public void show() {
		System.out.println("Benz " + type + " show .....");
	}

	public void run() {
		System.out.println("Benz " + type + " running...");
	}
}
