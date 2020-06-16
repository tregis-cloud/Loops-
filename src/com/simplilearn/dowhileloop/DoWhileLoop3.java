package com.simplilearn.dowhileloop;

public class DoWhileLoop3 {

	public static void main(String[] args) {
		// Create a list of students; always print first student
		// Iterate every student
		// Replace John with Will
		
      String studentList [] = {"Earl", "Mike","Grace","John", "Karl"};
      
      int i = 0;
       do {
           System.out.println("The old list is: "+ studentList[i] );
           i++;
         
          } while (i < studentList.length) ; 
       
       System.out.println ("");
      
      int j =0;
       do {
    	      
    	   if (studentList[j].equals("John")) 
    		  studentList[j] = "Will";
    	   
    	    System.out.println("The new list is: " + studentList[j]);
    	  
    	   j++;
         
          }while (j < studentList.length);
       
       System.out.println ("");
      
      
       
	}

}
