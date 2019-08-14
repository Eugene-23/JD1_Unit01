package htp.home.task02.main;

/*
 * Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

public class Task08 {

	public static void main(String[] args) {
		
		double a = 6;
		double b = -6;
		
		if ((a*a) > (b*b)) {
			System.out.println("Квадрат числа \"b\" меньше");			
			
		} else if ((b*b) > (a*a)) {
			System.out.println("Квадрат числа \"a\" меньше");
			
		} else if ((a*a) == (b*b)) {
			System.out.println("Квадраты чисел равны");
		}
		

	}

}
