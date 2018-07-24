package Selenium;

public class Grade {
  
	
	public static String CalculateGrade(int Score) {
		
			
		if (Score>90) {
			return "A";
			
		}
		
		else if (Score<80) {
			return "B";
		}
		
		return "F";
		
	}
	
	
}
