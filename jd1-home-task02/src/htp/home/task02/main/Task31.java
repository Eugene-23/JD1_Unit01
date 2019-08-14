package htp.home.task02.main;

/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task31 {

	public static void main(String[] args) {
		
		int A = 6;
		int B = 3;
		
		int x = 6;
		int y = 3;
		int z = 3;
		
		int min1 = 0;
		int min2 = 0;
		
		//определяем 2 наименьшие стороны кирпича
		if ((x <= y) && (y < z)) {
			min1 = x;
			min2 = y;
			
		}
		
		if ((z <= y) && (y < x)) {
			min1 = z;
			min2 = y;
			
		}
		
		if ((z <= x) && (x < y)) {
			min1 = z;
			min2 = x;
			
		}
		
		if ((x <= z) && (z < y)) {
			min1 = x;
			min2 = z;
			
		}
		
		if ((y <= z) && (z < x)) {
			min1 = y;
			min2 = z;
			
		}
		
		if ((y <= x) && (x < z)) {
			min1 = y;
			min2 = x;
			
		}
		
		if ((y == x) && (x == z)) {
			min1 = x;
			min2 = y;
			
		}
		
		if ( ((A > min1) && (B > min2)) || ((A > min2) && (B > min1)) ) {
			System.out.println("кирпич пройдет через отверстие");
			
		} else {
			System.out.println("кирпич НЕ пройдет через отверстие");
			
		}

	}

}
