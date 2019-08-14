package htp.home.task01.main;

/*
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, 
 * радиусы вписанной и описанной окружностей.
 */

public class Task19 {

	public static void main(String[] args) {
		
		int a = 5;	//сторона равностороннего треугольника
		
		double h = a * Math.sqrt(3) / 2;
		System.out.println("Высота треугольника " + h);
		
		double S = a * h / 2;
		System.out.println("площадь треугольника " + S);
		
		double r = a * Math.sqrt(3) / 6;
		System.out.println("радиус вписанной окружности " + r);
		
		double R = a * Math.sqrt(3) / 3;
		System.out.println("радиус описанной окружности " + R);

	}

}
