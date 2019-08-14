package htp.home.task01.main;

/*
 * Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
 */

public class Task30 {

	public static void main(String[] args) {
		
		double R1 = 500;
		double R2 = 400;
		double R3 = 300;
		
		double R = (R1 * R2 * R3) / ((R1*R2) + (R2*R3) + (R1*R3));
		
		System.out.println("сопротивление соединения равно " + R + " (Ом)");

	}

}
