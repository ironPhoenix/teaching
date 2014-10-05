package com.hans.keyword;

public class Test implements SuperTest {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	public final void run() {
		System.out.println("hehe");
	}

	public static void main(String[] args) throws Exception {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("end");
			throw new RuntimeException();
		}
	}
}
