package com.constructors;

public class Book {
	      String title;
	      String author;
	      public Book(String tit,String auth) {
	    	  title=tit;
	    	  author=auth;
	      }
	      public void display() {
	    	  System.out.println(title+" "+author);
	      }

	public static void main(String[] args) {
		Book book=new Book("The Girl with Dragon Tattoo","Stieg Larsson");
		book.display();
	}

}
