package Selenium;

public class Function_Return_Type {

	public static void main(String[] args) {
		addition();
		addition1(60, 56);
		addition1(110, 56);
		massaddition(30, 40, 4, 1);
	    age(20);
		

	}

	public static void addition() {
		int a=10,b=20;
		int sum;
		sum = a+b;
		System.out.println("Sum is "+ sum);
		
	}
	
	public static void addition1(int a, int b) {
		int sum;
		sum = a+b;
		System.out.println("Sum is "+ sum);
		
	}
//
//	public static void state() {
//
//		System.out.println("I am from Texas");
//	}
//	
	public static void age(int a) {
		int age = a;		
		
		System.out.println(age);
	}
//	
//	public static void adds(int a, int b) {
//		int add = a+b;
//		System.out.println(add);
	
//	}
   public static void massaddition (int a, int b, int c, int d) {
	
	int add=a+b+c+d;
	System.out.println(add);
}
}
