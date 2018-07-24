package Selenium;

import java.util.Scanner;

public class Homework2_4_28_18 {

	public static void main(String[] args) {
		
//	
//		int []number = {30,40,50};
//		
//	    for(int i=0;i<number.length;i++) {
//	    	System.out.println(number[i]);
//	    }
		
		//Ask user for a sentence and print each words one by one
	    
	    Scanner input = new Scanner(System.in);
	  
	    System.out.println("Enter Your Name");
	    
	    String Name;
	    Name = input.nextLine();
	    //System.out.println("Your name is "+ Name);
	    String NameStr= "Your Name is: "+ Name;
	   String[] braker = NameStr.split(" ");
    	for (String N:braker) {
    		System.out.println(N);
    	}
		
	
	   
	   
	   
	   //System.out.println(braker[2]);
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		}
		
		
		
		
}   
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

	


