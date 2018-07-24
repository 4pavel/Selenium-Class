package Selenium;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
	Scanner AskingString = new Scanner(System.in)	;
	
	System.out.println("I want to know how many characters were there in the Sring?");
	
	
	
	String Name;
	int age;
	
	Name = AskingString.nextLine();
	
	System.out.println("My name is: "+ Name.length());
	
	System.out.println("How old are you?");
	
	
	age = AskingString.nextInt();
	
	System.out.println("Your age is: " + age);
	
	

	}

}
