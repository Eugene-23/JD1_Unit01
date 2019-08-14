package htp.home.task03.main;

/*
 * Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
 */

public class Task13 {

	public static void main(String[] args) {
		
		double x, y;
		double h = 0.5;
		
		for(x = (-5); x <= 5; x += h) {
			
			System.out.print("x= " + x + ", ");
			
			y = 5 - (x * x / 2);
			
			System.out.println("y= " + y);
			
		}
		

	}

}
