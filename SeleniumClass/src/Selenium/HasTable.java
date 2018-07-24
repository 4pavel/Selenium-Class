package Selenium;

import java.util.Hashtable;

public class HasTable {

	public static void main(String[] args) {
		// In Hashtable we can store integer and string together

	Hashtable<Integer,String> H = new Hashtable();
	
	H.put(0, "Dallas");
	H.put(1, "Austin");
	H.put(2, "Houston");
	
	//System.out.println(H.get(1));
	
	for(int x=0;x<H.size();x++) {
		System.out.println(H.get(x));
	}
	
	}
	
	

}
