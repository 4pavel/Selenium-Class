package Selenium;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		
	    for (int x=0;x<v.size();x++) {
		//System.out.println(v.elementAt(3));
	    	System.out.println(v.get(x));
	    }
	}

}
