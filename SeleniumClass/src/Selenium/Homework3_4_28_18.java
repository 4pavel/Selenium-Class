package Selenium;

import java.util.Scanner;

public class Homework3_4_28_18 {

	public static void main(String[] args) {
		// If a=10 and b=20, how would I get b=10 and a=20. How do I switch them? Do not reassign.
		//Do this using a method so that a and b can be any number.
		int temp,a,b;
		Scanner Number = new Scanner (System.in);
		
		System.out.println("Enter the Number for a");
		a = Number.nextInt();
		System.out.println("Enter the Number for b");
		b = Number.nextInt();
		System.out.println(a +"and"+ b);
		temp = a;
		a=b;
		b=temp;
		System.out.println(a +"and"+ b);

	}

}
