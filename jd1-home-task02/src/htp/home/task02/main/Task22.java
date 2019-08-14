package htp.home.task02.main;

/*
 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */

public class Task22 {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 10;
		
		if (x > y) {
			
			int tempX = y;
			y = x;
			x = tempX;			
			
		}
		
		System.out.println("x = " + x + "; y = " + y);

	}

}
