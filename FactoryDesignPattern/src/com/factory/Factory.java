package com.factory;

public class Factory {

	public Operator getshow(String oper){
		
      if(oper.equalsIgnoreCase("Add"))
      {
         return new Add();
         
      } 
      else if(oper.equalsIgnoreCase("Sub"))
      {
         return new Sub();
         
      }
	return null;

	}
   }
