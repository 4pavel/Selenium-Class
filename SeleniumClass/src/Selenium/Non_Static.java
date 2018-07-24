package Selenium;

public class Non_Static {

	public static void main(String[] args) {
		
		Non_Static x = new Non_Static();//instance of an object
		x.car();
		x.flower();
		x.massaddition(7, 8, 9, 10);

	}
	
	public void car() {
		
	System.out.println("Toyota");	
	}

	
	public void flower() {
		System.out.println("Rose");
	}
	
	 public void massaddition (int a, int b, int c, int d) {
			
			int add=a+b+c+d;
			System.out.println(add);
}
	 
}