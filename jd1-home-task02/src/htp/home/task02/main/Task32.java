package htp.home.task02.main;

/*
 * Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них положительной.
 */

public class Task32 {

	public static void main(String[] args) {
		
		int x = -6;
		int y = -2;
		int z = 3;
		
		int sum1 = x + y;
		int sum2 = y + z;
		int sum3 = x + z;
				
		if (sum1 > 0) {
			System.out.println("Сумма X и Y является положительной и равна " + sum1);			
		}
		
		if (sum2 > 0) {
			System.out.println("Сумма Y и Z является положительной и равна " + sum2);			
		}
		
		if (sum3 > 0) {
			System.out.println("Сумма X и Z является положительной и равна " + sum3);			
		}
		
		if ( (sum1 <= 0) && (sum2 <= 0) && (sum3 <= 0) ) {
			System.out.println("Положительной суммы двух чисел не найдено");			
		}		

	}

}
