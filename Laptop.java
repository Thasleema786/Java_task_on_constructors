package com.constructors;

public class Laptop {
      String brand;
      int ramSize;
      public Laptop() {
    	  brand="hp";
    	  ramSize=8;
      }
       public Laptop(String brand1,int ramSize1) {
    	   brand=brand1;
    	   ramSize=ramSize1;  
       }
       public void showSpecs() {
    	    System.out.println("Laptop Brand is:"+brand);
    	    System.out.println("Laptop RAM Size is:"+ramSize);
       }
	public static void main(String[] args) {
		Laptop lap=new Laptop();
		Laptop lap1=new Laptop("Lenevo",16);
		lap.showSpecs();
		lap1.showSpecs();
		
	}

}
