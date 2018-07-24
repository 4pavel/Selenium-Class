package Selenium;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {

		// First Array represent Row
		// Second Array represent Column
		String flights[][] = new String[4][4];

		// first Row
		flights[0][0] = "Dallas";
		flights[0][1] = "NYC";
		flights[0][2] = "Miami";
		flights[0][3] = "Chicago";

		// Second Row
		flights[1][0] = "New Mexico";
		flights[1][1] = "San Diego";
		flights[1][2] = "DC";
		flights[1][3] = "Newark";

		// Third Row

		flights[2][0] = "New Orleans";
		flights[2][1] = "Baton Rouge";
		flights[2][2] = "Kansas";
		flights[2][3] = "Toronto";

		// Fourth Row

		flights[3][0] = "Denvar";
		flights[3][1] = "Honolulu";
		flights[3][2] = "Harrisburg";
		flights[3][3] = "Houston";

		System.out.println(flights[3][2]);

		int rows = flights.length;
		int cols = flights[0].length;

		// argument for rows
		for (int rownum = 0; rownum < rows; rownum++) {

		// argument for Column
		for (int column = 0; column < cols; column++) {
		
		System.out.println(flights[rownum][column]);

			}

		}

	}

}
