package htp.home.task02.main;

/*
 * Вычислить значение функции:
 */

public class Task39 {

	public static void main(String[] args) {

		double x = 9;
		
		double Fx;
		
		if (x >= 8) {
			Fx = (-1)*(x*x) + x - 9;
			
		} else {
			Fx = 1 / ((x*x*x*x) - 6);
			
		}
		
		System.out.println("значение функции F(x) = " + Fx);

	}

}
