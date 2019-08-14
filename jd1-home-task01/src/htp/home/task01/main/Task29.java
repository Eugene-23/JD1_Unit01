package htp.home.task01.main;

/*
 * Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */

public class Task29 {

	public static void main(String[] args) {
		
		double a = 4;
		double b = 3;
		double c = 5;
		
		double C1 = ((a*a) + (b*b) - (c*c)) / (2*a*b);
		double C = Math.acos(C1);						// в радианах
		double Cd = Math.toDegrees(C);					// в градусах
		
		double A1 = ((b*b) + (c*c) - (a*a)) / (2*b*c);
		double A = Math.acos(A1);						// в радианах
		double Ad = Math.toDegrees(A);					// в градусах
		
		double B1 = ((a*a) + (c*c) - (b*b)) / (2*a*c);
		double B = Math.acos(B1);						// в радианах
		double Bd = Math.toDegrees(B);					// в градусах
		
		System.out.println("Угол C равен " + Cd + " градусов " + " и " + C + " радиан");
		System.out.println("Угол A равен " + Ad + " градусов " + " и " + A + " радиан");
		System.out.println("Угол B равен " + Bd + " градусов " + " и " + B + " радиан");

	}

}
