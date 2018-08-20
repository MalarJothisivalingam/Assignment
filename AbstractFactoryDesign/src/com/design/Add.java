package com.design;

public class Add implements Operator1{

	@Override
	public void show(int a, int b) {
		System.out.println("output is "+ (a+b));
		
	}

}
