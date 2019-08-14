package htp.home.task01.main;

/*
 * Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
 */

public class Task24 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 5;
		double A = 45.0;
		
		double c = Math.toRadians(A);
		
		double S = a * b / Math.sin(c);
		
		System.out.println(S);

	}

}
