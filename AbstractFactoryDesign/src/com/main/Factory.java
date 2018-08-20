package com.main;

public class Factory {
	
		 public static AbstractFactory getFactory(String choice){
			   
		      if(choice.equalsIgnoreCase("Factory1")){
		         return new Factory1();
		         
		      }else if(choice.equalsIgnoreCase("Factory2")){
		         return new Factory2();
		      }
		      
		      return null;
		   }

}
