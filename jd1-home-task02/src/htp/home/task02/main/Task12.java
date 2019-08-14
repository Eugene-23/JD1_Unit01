package htp.home.task02.main;

/*
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, 
 * и в четвертую степень — отрицательные.
 */

public class Task12 {

	public static void main(String[] args) {
		
		double a = -6;
		double b = 6;
		double c = -5;
		
		if (a >= 0) {
			double A = a * a;
			System.out.println("a = " + A);
		} else {
			double A = Math.pow(a, 4);
			System.out.println("a = " + A);
		}
		
		if (b >= 0) {
			double B = b * b;
			System.out.println("b = " + B);
		} else {
			double B = Math.pow(b, 4);
			System.out.println("b = " + B);
		}
		
		if (c >= 0) {
			double C = c * c;
			System.out.println("c = " + C);
		} else {
			double C = Math.pow(c, 4);
			System.out.println("c = " + C);
		}

	}

}
