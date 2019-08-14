package htp.home.task01.main;

/*
 * Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

public class Task36 {

	public static void main(String[] args) {
		
		int K = 5673;
		
		int K1 = K / 1000;
		int K2 = (K % 1000) / 100;
		int K3 = (K % 100) / 10;
		int K4 = K % 10;
		
		double N = (((double)K2) * K4) / (K1 * K3);
		
		System.out.println("Частное произведений четных и нечетных цифр равно " + N);

	}

}
