package com.factory;

public class Add implements Operator{

	

	@Override
	public void show(int a, int b) {
		System.out.println("output is "+ (a+b));
		
	}

}
