package htp.home.task02.main;

/*
 * Подсчитать количество положительных среди чисел а, b, с.
 */

public class Task19 {

	public static void main(String[] args) {

		double a = 5;
		double b = 7;
		double c = -3;
		
		int k = 0;
		
		if (a > 0) {
			k++;
		}
		
		if (b > 0) {
			k++;
		}
		
		if (c > 0) {
			k++;
		}
		
		System.out.println("Положительных чисел " + k);		

	}

}
