package com.simplilearnforloop;

public class BankOpr {
	static int accounts [] = {101, 102, 103, 104, 105, 106};
	static String accountName [] = {"John", "Sam","David","Will","Sam", "Jane"};
	static double accountBalance [] = {100_000, 200_000, 300_000, 400_000, 500_000,600_000};
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 BankOpr.showBalance(103);	
	 BankOpr.depositBalance(103,200_000);
	 BankOpr.withdrawBalance(106, 50_000);
	}	
		
		public static void showBalance(int accountNumber) {
			for (int i=0; i < accounts.length; i++ ) {
				if (BankOpr.accounts[i] == accountNumber) {
					
					System.out.println ("This account number is " + BankOpr.accounts[i] +
					        " with user name: " + BankOpr.accountName[i] +
							" with balance: " + BankOpr.accountBalance[i]);
			
			   }
			     }
     	}
     
		 public static void depositBalance (int accountNumber, double amount) {
			 for (int i=0; i < accounts.length; i++) {
				 if (accounts[i]== accountNumber) {
					 accountBalance[i] = accountBalance [i] + amount;
					 
					 System.out.println ("This account number is " + BankOpr.accounts[i] +
						        " with user name: " + BankOpr.accountName[i] +
								" with balance: " + BankOpr.accountBalance[i]);
				 }
			 }
		 }
		 
		 
		 public static void withdrawBalance (int accountNumber, double amount) {
			 for (int i=0; i < accounts.length; i++) {
				 if (accounts[i]== accountNumber) {
					 accountBalance[i] = accountBalance [i] - amount;
					 
					 System.out.println ("This account number is " + BankOpr.accounts[i] +
						        " with user name: " + BankOpr.accountName[i] +
								" with balance: " + BankOpr.accountBalance[i]);
				 }
			 }
		 } 
		 
        

}
