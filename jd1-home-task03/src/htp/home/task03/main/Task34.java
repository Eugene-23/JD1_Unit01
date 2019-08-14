package htp.home.task03.main;

/*
 * Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */

public class Task34 {

	public static void main(String[] args) {
		
		System.out.print("Числа, сумма цифр которых равна 15: ");
		
		for (int i = 1000; i <= 9999; i++) {
			
			int k = i / 1000;
			int l = (i % 1000) / 100;
			int m = (i % 100) / 10;
			int n = i % 10;
			
			int sum = k + l + m + n;
			
			if (sum == 15) {
				System.out.print(i + ", ");
				
			}
			
		}
		
	}

}
