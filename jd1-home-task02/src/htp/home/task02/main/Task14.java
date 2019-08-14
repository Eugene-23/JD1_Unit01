package htp.home.task02.main;

/*
 * Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task14 {

	public static void main(String[] args) {
		
		double A = 30;
		double B = 60;
		
		if ( (0 < A) && (A < 180) && (0 < B) && (B < 180) && ((A + B) < 180) ) {
			System.out.println("Треугольник существует");
			
			if ( (A == 90) || (B == 90) || ((180 - A - B) == 90) ) {
				System.out.println("Треугольник прямоугольный");
				
			} else {
				System.out.println("Треугольник не прямоугольный");
				
			}
			
		} else {
			System.out.println("Треугольник не существует");
			
		}

	}

}
