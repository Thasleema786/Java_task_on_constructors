package com.constructors;

public class BankAccount {
   double balance;
   String customerName;
   String address;
   public BankAccount(double bal,String customerName1,String address1) {
	   balance=bal;
	   customerName=customerName1;
	   address=address1;
   }
   public BankAccount() {
	   balance=0;
	   customerName="NA";
	   address="NA";
   }
   public void withdraw(double amount) {
	      if(amount<=0) {
	    	  System.out.println("Insufficient Amount");
	      }else {
	    	  System.out.println("Amount is:"+amount);
	      }
   }
    public void deposit(double amount) {
	   System.out.println("Total Amount is:"+(amount+balance));
   }
    public void updateAddress(String newAddress) {
    	System.out.println("The Update Address is:"+newAddress);
    }
    public void updateCustomerName(String newCustomerName) {
    	  System.out.println("The Update Customer Name is:"+newCustomerName);
    }
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		BankAccount bank1=new BankAccount(10000,"Bujji","Ongole");
		bank. withdraw(0);
		bank.deposit(10000);
		bank.updateAddress("Hyderabad");
		bank.updateCustomerName("Shammi");
	}

}
