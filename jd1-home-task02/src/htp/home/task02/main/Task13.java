package htp.home.task02.main;

/*
 * Даны две точки А(х1, у1) и В(х2, у2). 
 * Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
 */

public class Task13 {

	public static void main(String[] args) {
		
		double x1 = 2;						//точка A
		double y1 = 4;
		
		double x2 = 4;						//точка B
		double y2 = 3;
		
		double a1 = (x1*x1) + (y1*y1);
		double a2 = (x2*x2) + (y2*y2);
		
		double A = Math.sqrt(a1);		
		double B = Math.sqrt(a2);		
	
		if (A > B) {
			System.out.println("Точка A ближе к началу координат");
			
		} else if (A < B) {
			System.out.println("Точка B ближе к началу координат");
			
		} else {
			System.out.println("Расстояния равны");
			
		}
		
		
		
		

	}

}
