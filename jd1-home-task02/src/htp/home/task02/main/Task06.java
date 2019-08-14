package htp.home.task02.main;

/*
 * Составить программу: определения наибольшего из двух чисел а и b.
 */

public class Task06 {

	public static void main(String[] args) {

		int a = 9;
		int b = 6;
		
		if (a > b) {
			
			System.out.println("наибольшее число " + a);
			
		} else if (a < b) {
			
			System.out.println("наибольшее число " + b);
			
		} else {
			
			System.out.println("числа равны");
			
		}

	}

}
