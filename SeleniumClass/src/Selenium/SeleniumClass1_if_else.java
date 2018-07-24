package Selenium;

public class SeleniumClass1_if_else {

	public static void main(String[] args) {
		
		//If Else statement
		//Operators in Java = <,>,=,<=,=>,!
		
		int i=400;
		int j=300;
		int k=400;
		
		if (i<j)	//less then j
		System.out.println("Print i value");	
		else
		System.out.println("Print j value");	
			
		if (i<k)
       System.out.println("Print i value");
		else
		System.out.println("Print k value");	
		
		//Comparing two variable, use ==
		//assigning a value, use = 
		
		if (i==k)
			System.out.println("Value of i and k are same");
		else
			System.out.println("Value of i and k are not same");
		
		
		if (j>k)
		{
			System.out.println("print j value");
		}
		else
		{
			System.out.println("Print k value");
		}
		
		if (!(i==k))//not equal condition example. ! sign represent not equal.
		{
			System.out.println("Value of i and k are not equal");
		}
		
		else
		{
			System.out.println("Value of i and k are equal and the value of i: " + i);
		}
	
	
	
	}
	
	

}
