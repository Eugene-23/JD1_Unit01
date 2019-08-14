package htp.home.task01.main;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Task09 {

	public static void main(String[] args) {
		
		double a = 9;
		double b = 4;
		double c = 5;
		double d = 8;
		
		double e = ((a / c) * (b / d)) - ((a * b - c) / (c * d));
		
		System.out.println(e);

	}

}
