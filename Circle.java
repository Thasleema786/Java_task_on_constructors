package com.constructors;

public class Circle {
        double radius;
        public Circle() {
        	radius=10;
        	System.out.println("Radius is:"+radius);
        }
        public double getArea(double radius) {
        	  double area=3.14*radius *radius;
        	  return  area;
        }
        public double getCircumference(double radius) {
        	double circumference=2*3.14*radius;
        	return circumference;
        }
	public static void main(String[] args) {
          Circle circle=new Circle();
           double result=circle.getArea(10);
           System.out.println("Area of the circle is:"+result);
            double result1= circle.getCircumference(10);
            System.out.println("Circumference of circle is:"+result1);
	}

}
