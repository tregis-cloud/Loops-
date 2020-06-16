package com.simplilearn.whileloop;

public class WhileLoop3 {

	public static void main(String[] args) {
		//Iterate a list of IP addresses
		String ips[]= {"192.168.2.3","192.168.2.4","192.168.2.5","192.168.2.4","192.168.2.5"};
		
		int index = 0;
		while(index < ips.length) {
			System.out.println("The ip is: " + ips[index]);
			index++;
		}
	    
		//replace ip address "192.168.2.4" with ip address "192.150.60.25"
		System.out.println("");
		System.out.println("---------------------------");
		int i =0;
		while (i < ips.length) {
			if (ips[i].equals("192.168.2.4")) 
					ips[i]="192.150.60.25";
			
			System.out.println("The new ip list:" + ips[i]);
			i++;
		}
	}

}
