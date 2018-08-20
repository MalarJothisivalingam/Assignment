package com.factory;

public class Main {
	public static void main(String[] args) {
		Factory obj=new Factory();
		Operator s1=obj.getshow("Add");
		s1.show(10, 20);
		Operator s2=obj.getshow("Sub");
		s2.show(20, 10);
	}

}
