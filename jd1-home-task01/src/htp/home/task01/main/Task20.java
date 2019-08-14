package htp.home.task01.main;

/*
 * Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */

public class Task20 {

	public static void main(String[] args) {
		
		int L = 20;
				
		double S = L * L / (4 * Math.PI);
		
		System.out.println("площадь круга " + S);

	}

}
