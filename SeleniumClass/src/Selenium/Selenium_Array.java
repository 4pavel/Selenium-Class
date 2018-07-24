package Selenium;

public class Selenium_Array {

	public static void main(String[] args) {
		
		
		String[]rain = new String [4];
		rain[0]="cold";
		rain[1]="mild";
		rain[2]="warm";
		rain[3]="hot";
		
		//for(int i=0;i<rain.length;i++) {
			
			//System.out.println(rain[i]);
		
		System.out.println(rain[0]);
		
		String[] Fruits;
		Fruits = new String[3];
		Fruits[0] = "Apple";
		Fruits[1] = "Pear";
		Fruits[2] = "Pinapple";
		System.out.println(Fruits[2]);
		
		//OR
		String[] Birds = new String[2];
		Birds[0] = "Peacock";
		Birds[1] = "Chicken";
		
		System.out.println(Birds[0]);
		
		String[] valueCar = {"BMW", "Toyota", "Honda"};
		
		System.out.println("First Car: " + valueCar[0]);
		System.out.println("Second Car: " + valueCar[1]);
		System.out.println("Second Car: " + valueCar[2]);
		
		String[] cars = {"lembo","kia","jaguar"};
		for (int i=0;i<cars.length;i++ ) {
		System.out.println("The name of the car: " + cars[i]);	
		}
		//OR
		
		String[] dream = {"Audi","Porsche", "Lexus"};
		for (String TheName:dream) {
		System.out.println(TheName);	
		}
		String[]names = {"John","Paul"};
		System.out.println(names[2]);
		
	    
	}

}
