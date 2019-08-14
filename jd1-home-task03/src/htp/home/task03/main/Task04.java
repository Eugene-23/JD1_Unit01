package htp.home.task03.main;

/*
 * С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
 */

public class Task04 {

	public static void main(String[] args) {
		
		int a = 2;
		
		while (a <= 100) {
			
			if (a % 2 == 0) {
				
				System.out.print(a + " ");
				
			}
			
			a++;
			
		}

	}

}
