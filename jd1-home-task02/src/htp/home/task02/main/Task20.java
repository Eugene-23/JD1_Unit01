package htp.home.task02.main;

/*
 * Определить, делителем каких чисел а, b, с является число k.
 */

public class Task20 {

	public static void main(String[] args) {

		int a = 24;
		int b = 20;
		int c = 30;
		
		int k = 6;
		
		if (a % k == 0) {
			System.out.println(k + " является делителем числа " + a);
			
		}
		if (b % k == 0) {
			System.out.println(k + " является делителем числа " + b);
			
		}
		if (c % k == 0) {
			System.out.println(k + " является делителем числа " + c);
			
		} 		

	}

}
