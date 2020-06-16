package com.simplilearn.whileloop;

public class WhileLoop4 {

 public static void main(String[] args) {
		// Take a bank account list with names --> find out any user with name
		// "raj123" and replace it with user name "raju321"

      String bankList [] = {"raj987","eat654","jar202","car221","raj123"};
      
      int j =0;
      while (j < bankList.length) {
    	  System.out.println ("The old array list is: " + bankList[j]);
    	  j++;
      }
     
      	System.out.println ("");
      	System.out.println ("-----------------------------");
       
      int i = 0;
      while (i<bankList.length) {
    	  if (bankList[i].equals("raj123"))
    		  bankList[i] = "raju321";
    	  System.out.println ("The new array list is: " + bankList[i]);
    	  i++; 
      }
      
	}
}
