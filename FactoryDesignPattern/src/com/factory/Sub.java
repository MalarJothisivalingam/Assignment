package com.factory;

public class Sub implements Operator{

	@Override
	public void show(int a, int b) {
	System.out.println("Output is "+ (a-b));
		
	}

}
