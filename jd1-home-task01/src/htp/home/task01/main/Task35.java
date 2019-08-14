package htp.home.task01.main;

/*
 * Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
 */

public class Task35 {

	public static void main(String[] args) {
		
		double M = 158;
		double N = 15;
		
		double K = M / N;
		
		int kM = (int)K % 10;
		int kN = (int)(K * 10) % 10;
		
		System.out.println("M/N равно " + K);
		System.out.println("Младшая цифра целой части - " + kM + ", старшая цифра дробной части - " + kN);

	}

}
