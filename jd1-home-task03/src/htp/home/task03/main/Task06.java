package htp.home.task03.main;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа
 * суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task06 {

	public static void main(String[] args) {

		int a = 21;
		
		int s = 0;
		
		for (int i = 1; i <=a; i++) {
			
			s += i;
			
		}
		
		System.out.println(s);

	}

}
