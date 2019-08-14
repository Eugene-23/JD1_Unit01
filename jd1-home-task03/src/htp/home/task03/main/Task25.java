package htp.home.task03.main;

/*
 * Требуется определить факториал числа, которое ввел пользователь.
 */

public class Task25 {

	public static void main(String[] args) {
		
		int N = 15;
		
		long fact = 1;
		
		for (int i = 1; i <= N; i++) {
			
			fact *= i;
			
		}
		
		System.out.println(fact);

	}

}
