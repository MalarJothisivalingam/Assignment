package com.main;

import com.design.Operator1;
import com.design.Operator2;

public class main {
	
	public static void main(String[] args) {
	
       AbstractFactory Factory1 = Factory.getFactory("Factory1");
       Operator1 opt1=	Factory1.getoper1("Add");
       opt1.show(10,20);
       Operator1 opt2=	Factory1.getoper1("Sub");
       opt2.show(30,20);
       AbstractFactory Factory2 = Factory.getFactory("Factory2");
       Operator2 opt3=	Factory2.getoper2("Mul");
       opt3.show(10,20);
       Operator2 opt4=	Factory2.getoper2("Div");
       opt4.show(100,20);
       

	      

	     
	   }

}