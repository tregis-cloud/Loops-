package com.simplilearn.whileloop;

public class WhileLoop2 {

	public static void main(String[] args) {
	
		//An array is an order collection of similar type of values
     int numArr[] = {10, 200, 30, 40, 500};
     
     int i = 0;
     int j = 0;
     int sum =0;
     int avg =0;
     while (i < numArr.length) {
    	 System.out.print("The index is:"+ i);
    	 System.out.println(" the value is:" + numArr[i]);
    	 i++;
     }

     //Create while loop to sum array elements
     
     while (j < numArr.length) {
    	 
    	 sum = sum + numArr[j];
    	 avg = sum/numArr.length;
    	 j++;
     }
     System.out.println("-------------------------------");
     System.out.println("The sum of the array is:" + sum);
     System.out.println("The avg of the array is:" + avg);
	
	}

}
