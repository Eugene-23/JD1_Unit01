package htp.home.task02.main;

/*
 * Составить программу: определения наименьшего из двух чисел а и b.
 */

public class Task05 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 6;
		
		if (a < b) {
			
			System.out.println("наименьшее число " + a);
			
		} else if (a > b) {
			
			System.out.println("наименьшее число " + b);
			
		} else {
			
			System.out.println("числа равны");
			
		}

	}

}
