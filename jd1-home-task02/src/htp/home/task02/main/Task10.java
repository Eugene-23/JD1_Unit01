package htp.home.task02.main;

/*
 * Составить программу, которая определит площадь какого круга меньше.
 */

public class Task10 {

	public static void main(String[] args) {
		
		double R1 = 6;
		double R2 = 6;
		
		double S1 = Math.PI * R1 * R1;
		double S2 = Math.PI * R2 * R2;
		
		if (S1 < S2) {
			System.out.println("Площадь круга 1 меньше");
			
		} else if (S1 > S2) {
			System.out.println("Площадь круга 2 меньше");
			
		} else if (S1 == S2) {
			System.out.println("Площади кругов равны");
			
		}

	}

}
