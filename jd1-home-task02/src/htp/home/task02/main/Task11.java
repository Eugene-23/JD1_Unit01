package htp.home.task02.main;

/*
 * Составить программу, которая определит площадь какого треугольника больше.
 */

public class Task11 {

	public static void main(String[] args) {

		double a1 = 6;
		double h1 = 5;
		
		double a2 = 4;
		double h2 = 7;
		
		double S1 = a1 * h1 / 2;
		double S2 = a2 * h2 / 2;
		
		if (S1 > S2) {
			System.out.println("Площадь треугольника 1 больше");
			
		} else if (S1 < S2) {
			System.out.println("Площадь треугольника 2 больше");
			
		} else if (S1 == S2) {
			System.out.println("Площади треугольников равны");
			
		}
		

	}

}
