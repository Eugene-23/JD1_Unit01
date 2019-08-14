package htp.home.task01.main;

/*
 * Найти произведение цифр заданного четырехзначного числа.
 */

public class Task16 {

	public static void main(String[] args) {
		
		int k = 3762;
		
		int a = k / 1000;
		int b = (k - (a * 1000)) / 100;
		int c = k%100 / 10;
		int d = k%10;
		
		int sum = a + b + c + d;
		
		System.out.println(sum);

	}

}
