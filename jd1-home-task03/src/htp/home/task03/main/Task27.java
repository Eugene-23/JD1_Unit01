package htp.home.task03.main;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
 * самого числа. m и n вводятся с клавиатуры.
 */

public class Task27 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
				
		int m;
		
		System.out.print("Введите начальное число m > ");
		m = sc.nextInt();
		
		int n;
		
		System.out.print("Введите конечное число n > ");
		n = sc.nextInt();			
		
		for (int i = m; i <= n; i++) {
			System.out.println("Делители числа " + i + ":");
			
			for (int j = i - 1; j > 1; j --) {
				if ((i % j) == 0) {
					System.out.println(j);
				}
				
			}
			
		}		

	}

}
