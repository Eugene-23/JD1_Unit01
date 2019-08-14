package htp.home.task01.main;

/*
 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */

public class Task17 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = -2;
		
		double a3 = Math.pow(a, 3);
		double b3 = Math.pow(b, 3);
		
		double sa = (a3 + b3) / 2;
		
		System.out.println("среднее арифметическое кубов чисел " + sa);
				
		double sg = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("среднее геометрическое чисел " + sg);

	}

}
