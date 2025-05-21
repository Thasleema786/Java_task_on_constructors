package com.constructors;

public class Rectangle {
		int length;
		 int breadth;
		   public Rectangle() {
			   System.out.println("Non parameterized constructor");
			 length=10;
			 breadth=5; 
		 } 
		   public Rectangle(int len,int bread) {
			   System.out.println("Parameterized Constructor");
			   length=len;
			   breadth=bread;
			   System.out.println(length+" "+breadth);
		   }
		   public void area() {
			     System.out.println("Area Of the rectangle:"+length*breadth);
		   }
		   public static void main(String[] args) {
			  Rectangle rect=new Rectangle();
			  Rectangle rect1=new Rectangle(20,10);
			  rect1.area();
		}

	}


