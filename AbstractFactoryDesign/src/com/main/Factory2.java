package com.main;

import com.design.Add;
import com.design.Divide;
import com.design.Multiple;
import com.design.Operator1;
import com.design.Operator2;
import com.design.Sub;




public class Factory2 extends AbstractFactory{

	@Override
	Operator1 getoper1(String Factory1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Operator2 getoper2(String Factory2) {
			
	      
	      if(Factory2.equalsIgnoreCase("Mul")){
	         return new Multiple();
	         
	      }else if(Factory2.equalsIgnoreCase("Div")){
	         return new Divide();
	         
	      }
	      return null;
	
	}

	
}
