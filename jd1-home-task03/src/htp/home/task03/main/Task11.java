package htp.home.task03.main;

/*
 * Составить программу нахождения разности кубов первых двухсот чисел
 */

public class Task11 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 200; i++) {
			
			sum -= i * i * i;
			
		}
		
		System.out.println(sum);

	}

}
