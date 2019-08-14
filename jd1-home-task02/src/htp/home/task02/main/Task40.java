package htp.home.task02.main;

/*
 * Вычислить значение функции:
 */

public class Task40 {

	public static void main(String[] args) {

		double x = 3;
		
		double Fx;
		
		if (x <= 13) {
			Fx = (-1)*(x*x*x) + 9;
			
		} else {
			Fx = (-3) / (x + 1);
			
		}
		
		System.out.println("значение функции F(x) = " + Fx);

	}

}
