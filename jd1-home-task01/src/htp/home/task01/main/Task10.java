package htp.home.task01.main;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Task10 {

	public static void main(String[] args) {
		
		double x = 9;
		double y = 4;
		
		
		double a = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println(a);

	}

}
