package htp.home.task02.main;

/*
 * Даны действительные числа х и у, не равные друг другу. 
 * Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */

public class Task15 {

	public static void main(String[] args) {
		
		double x = 6;
		double y = 5;
		
		if (x < y) {
			double x1 = (x + y) / 2;
			double y1 = 2 * x * y;
			
			System.out.println("x = " + x1 + ", y = " + y1);
			
		} else if (x > y) {
			double y1 = (x + y) / 2;
			double x1 = 2 * x * y;
			
			System.out.println("x = " + x1 + ", y = " + y1);
			
		} else {
			System.out.println("Числа не должны быть равны, читай условие задачи");
			
		}
			

	}

}
