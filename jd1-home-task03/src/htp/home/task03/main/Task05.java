package htp.home.task03.main;

/*
 * С помощью оператора while напишите программу определения суммы всех нечетных чисел в
 * диапазоне от 1 до 99 включительно.
 */

public class Task05 {

	public static void main(String[] args) {

		int a = 1;
		int s = 0;
		
		while (a <= 99) {
			
			if (a % 2 != 0) {
				
				s += a;
				
			}
			
			a++;			
			
		}
		
		System.out.println(s);

	}

}
