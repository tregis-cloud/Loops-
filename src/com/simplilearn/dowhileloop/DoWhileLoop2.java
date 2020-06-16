package com.simplilearn.dowhileloop;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// 
		String playerList [] = {"Suchin","Kholi","Usuf","Raina", "Dhoni"};
		
		int index = 0;
		do {
			System.out.println("The player number:" +index+ " is " + playerList[index] );
			index++;
			
		   } while (index < playerList.length);
		}

	}


