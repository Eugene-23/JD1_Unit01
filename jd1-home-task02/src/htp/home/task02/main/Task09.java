package htp.home.task02.main;

/*
 * Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
 */

public class Task09 {

	public static void main(String[] args) {
		
		double a = 6;
		double b = 6;
		double c = 5;
		
		if ((a > 0) && (b > 0) && (c > 0)) {
			
			if ((a == b) && (b == c)) {
				System.out.println("треугольник равносторонний");			
			
			} else {
				System.out.println("треугольник не равносторонний");
			
			}
			
		}	
		else {
			System.out.println("треугольник не существует");
			
		}

	}

}
