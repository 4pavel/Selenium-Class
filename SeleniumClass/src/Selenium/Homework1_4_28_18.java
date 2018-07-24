package Selenium;

import java.util.Scanner;

public class Homework1_4_28_18 {

	public static void main(String[] args) {
		//Ask for 2 Numbers and print out all the numbers in between.
		
		Scanner number=new Scanner(System.in);
		
		int number1,number2;
		System.out.println("Enter first Number");
		
        number1=number.nextInt();
        System.out.println("First number is:"  + number1);
        
        System.out.println("Enter second number");
        number2=number.nextInt();
        System.out.println("Second Number is: "+ number2);
        
        for (int i=number1;i<number2;i++) {
        System.out.println("Ascending numbers are:"+ i);
        
        }
		
		
		
		

	}

}
