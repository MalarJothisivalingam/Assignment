package com.demo;

public class DogName implements Cloneable{
	private String dname;
	  public DogName(String dname) {
			this.dname = dname;
		   }

	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}

	public Object clone()throws CloneNotSupportedException{  
		return (DogName)super.clone();  
	   }
	public static void main(String[] args) 
	{
		DogName obj1 = new DogName("Tommy");
		try {
			DogName obj2 = (DogName) obj1.clone();
			System.out.println(obj2.getDname());
			obj1.setDname("Tom");
			obj2.setDname("khkhikh");
			System.out.println(obj1.getDname());
			System.out.println(obj2.getDname());
			
			/*DogName obj3 = (DogName) obj1.clone();
			System.out.println(obj3.getDname());*/
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	   }
}
