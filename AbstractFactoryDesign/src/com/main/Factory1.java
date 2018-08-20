package com.main;

import com.design.Add;
import com.design.Operator1;
import com.design.Operator2;
import com.design.Sub;


public class Factory1 extends AbstractFactory{

	@Override
	Operator1 getoper1(String Factory1) {
			
	      
	      if(Factory1.equalsIgnoreCase("Add")){
	         return new Add();
	         
	      }else if(Factory1.equalsIgnoreCase("Sub")){
	         return new Sub();
	         
	      }
	      return null;
	}

	@Override
	Operator2 getoper2(String Factory2) {
		// TODO Auto-generated method stub
		return null;
	}


}
