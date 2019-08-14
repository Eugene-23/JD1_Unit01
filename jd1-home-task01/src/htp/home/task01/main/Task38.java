package htp.home.task01.main;

/*
 * Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */

public class Task38 {

	public static void main(String[] args) {
		
		double x = -2;						//график a)
		double y = 2;
		
		boolean resultA = false;
		
		if (x >= 0) {
			resultA = (y <= (4 - x) && (y >= 0));
			
		} else if (x < 0) {
			resultA = (y <= (x + 4) && (y >= 0));
		}
		
		System.out.println("График a) " + resultA);
		
		
		x = 4;						//график b)
		y = -3;
		
		boolean resultB = false;
		
		if ((y >= 0) && (y <=4 )) {
			resultB = ((x >= (-2)) && (x <= 2));					
		
		} else if ((y < 0) && (y >= (-3))) {
			resultB = ((x >= (-4)) && (x <= 4));		
		}
		System.out.println("График b) " + resultB);
		
		
		x = 3;						//график с)
		y = -3;
		
		boolean resultC = false;		
		
		if (y >= 0) {
		resultC = ((x * x + y * y <=  4 * 4) && x >= 0);			
		System.out.println("График c) " + resultC);
		
		} else if (y < 0) {
			resultC = ((x * x + y * y <=  5 * 5) && x >= 0);			
			System.out.println("График с) " + resultC);
		}

	}

}
