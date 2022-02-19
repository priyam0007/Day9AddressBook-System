package com.blzaddressbook;

public class Person {
	static Contact [] personDetails = new Contact[10];
	
	public static void main(String args[]) 
	{
		Contact person1 = new Contact("Priya","M","Bijapur","KA",35,8620,"priya@gmail.com");
		Contact person2 = new Contact("Rishi","R","Chitrudurga","KA",98,9736,"rishi@yahoo.com");
		Contact person3 = new Contact("Gwarav","G","Durga","KA",47,7620,"gwarav@edu.com");
	    personDetails[0]=person1;
	    personDetails[1]=person2;
	    personDetails[2]=person3;
	    
	    System.out.println("Created contact list is");
	    for(int i = 0; i < 3;i++) {
		   System.out.println(personDetails[i]);
	    }
	}
}


