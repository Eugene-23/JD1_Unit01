package htp.home.task02.main;

/*
 * Написать программу нахождения суммы большего и меньшего из трех чисел.
 */

public class Task26 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 6;
		int c = 5;		
		
		int min = 0;
		int max = 0;
		int sum = 0;
		
		if ((a <= b) && (b < c)) {
			min = a;
			max = c;
			
		}
		
		if ((c <= b) && (b < a)) {
			min = c;
			max = a;
			
		}
		
		if ((c <= a) && (a < b)) {
			min = c;
			max = b;
			
		}
		
		if ((a <= c) && (c < b)) {
			min = a;
			max = b;
			
		}
		
		if ((b <= c) && (c < a)) {
			min = b;
			max = a;
			
		}
		
		if ((b <= a) && (a < c)) {
			min = b;
			max = c;
			
		}
		
		if ((b == a) && (a == c)) {
			min = b;
			max = c;
			
		}
		
		
		sum = min + max;
		
		System.out.println("сумма большего и меньшего числа равна " + sum);

	}

}
