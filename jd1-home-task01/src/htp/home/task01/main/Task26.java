package htp.home.task01.main;

/*
 * Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
 */

public class Task26 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		double y = 35.0;
		
		double c = Math.toRadians(y);
		
		double S = a * b * Math.sin(c) / 2;
		
		System.out.println("Площадь треугольника " + S);

	}

}
