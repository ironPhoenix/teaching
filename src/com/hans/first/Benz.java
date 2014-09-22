package com.hans.first;

public class Benz {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void run() {
		System.out.println("Benz " + type + " running...");
	}
}
