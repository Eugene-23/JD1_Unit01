package htp.home.task01.main;

/*
 * Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
 * что а≠0 и что дискриминант уравнения неотрицателен).
 */

public class Task25 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = -9;
		int c = 3;
		
		double D = (b * b) - (4 * a * c);		
		System.out.println("Дискриминант = " + D);
		
		double x1 = ((-1) * b + Math.sqrt(D)) / (2 * a);		
		System.out.println("x1 = " + x1);
		
		double x2 = ((-1) * b - Math.sqrt(D)) / (2 * a);		
		System.out.println("x2 = " + x2);

	}

}
