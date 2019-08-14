package htp.home.task02.main;

/*
 * Вычислить значение функции:
 */

public class Task37 {

	public static void main(String[] args) {

		double x = 2;
		
		double Fx;
		
		if (x >= 3) {
			Fx = (-1)*(x*x) + 3*x + 9;
			
		} else {
			Fx = 1 / ((x*x*x) - 6);
			
		}
		
		System.out.println("значение функции F(x) = " + Fx);

	}

}
