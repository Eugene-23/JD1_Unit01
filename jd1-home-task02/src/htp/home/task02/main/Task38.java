package htp.home.task02.main;

/*
 * Вычислить значение функции:
 */

public class Task38 {

	public static void main(String[] args) {
		
		double x = -3;
		
		double Fx;
		
		if ((0 <= x) && (x <= 3)) {
			Fx = x*x;
			
		} else {
			Fx = 4;
			
		}
		
		System.out.println("значение функции F(x) = " + Fx);

	}

}
