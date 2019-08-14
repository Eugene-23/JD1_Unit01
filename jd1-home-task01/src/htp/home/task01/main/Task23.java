package htp.home.task01.main;

/*
 * Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
 */

public class Task23 {

	public static void main(String[] args) {
		
		int r = 10;
		int R = 12;
		
		double S1 = Math.PI * r * r;
		double S2 = Math.PI * R * R;
		double S = S2 - S1;
		
		System.out.println(S);		

	}

}
