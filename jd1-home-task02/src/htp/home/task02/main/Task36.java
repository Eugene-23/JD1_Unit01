package htp.home.task02.main;

/*
 * Вычислить значение функции:
 */

public class Task36 {

	public static void main(String[] args) {
		
		double x = 2;
		
		double Fx;
		
		if (x <= 3) {
			Fx = (x*x) - 3*x + 9;
			
		} else {
			Fx = 1 / ((x*x*x) + 6);
			
		}
		
		System.out.println("значение функции F(x) = " + Fx);

	}

}
