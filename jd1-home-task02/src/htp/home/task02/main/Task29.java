package htp.home.task02.main;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task29 {

	public static void main(String[] args) {
		
		int x1 = 1;		//A
		int y1 = 1;
		
		int x2 = 2;		//B
		int y2 = 2;
		
		int x3 = 3;		//C
		int y3 = 3;
		
		if (( (x1 - x3)*(y2 - y3) ) == ( (x2 - x3)*(y1 - y3) )) {
			System.out.println("Точки расположены на одной прямой");
			
		} else {
			System.out.println("Точки расположены НЕ на одной прямой");
			
		}
		

	}

}
