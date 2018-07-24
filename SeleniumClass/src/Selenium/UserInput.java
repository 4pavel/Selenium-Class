package Selenium;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner (System.in);
		
		    String name;
		    int age;
		    
		    System.out.println("What is your name?");
		    
		    name = input.nextLine();
		    System.out.println("My name is:" + name);
		    System.out.println("How old are you?");
		    age  = input.nextInt();
		    
		    
		    System.out.println("My age is: " + age);
}
}

//1. Write a program that convert Euro to US Dollar - Requirement: Program will ask for the Euro amount and it will convert to US Dollar.
//2. Make a price checker program that is used in shopping malls - 
//Requirement -Program will ask, what is the product you are looking for?
//-Program should be able to give the price including Tax and product details
//-If certain product is not found, the program will print a default message saying that product is not available

//