package htp.home.task01.main;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Task08 {

	public static void main(String[] args) {
		
		double a = 9;
		double b = 3;
		double c = 5;
		
		double d = (b + (Math.sqrt((b * b) + (4 * a * c)))) / (2 * a) - (a * a * a * c) + (Math.pow(b, (-2)));
		
		System.out.println(d);

	}

}
