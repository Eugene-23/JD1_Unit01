package htp.home.task01.main;

/*
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

public class Task14 {

	public static void main(String[] args) {
		
		double R = 12;
		
		double C = 2 * Math.PI * R;
		double S = Math.PI * R * R;
		
		System.out.println("длина окружности " + C);
		System.out.println("площадь круга " + S);

	}

}
