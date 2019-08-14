package htp.home.task03.main;

/*
 * Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
 */

public class Task40 {

	public static void main(String[] args) {

		int N = 125;

		System.out.println("число N = " + N);

		int T, T2;

		for (int N1 = N; N1 > 0; N1--) {

			int N2 = N1;

			T = N2 % 10;
			T2 = N2 % 100 / 10;

			if ((T != 0) && (T2 != 0) && (N2 % T == 0) && (N2 % T2 == 0)) {

				System.out.println(N2 + " делится на все свои числа");

			} 

			N2 /= 10;

		}

	}

}
