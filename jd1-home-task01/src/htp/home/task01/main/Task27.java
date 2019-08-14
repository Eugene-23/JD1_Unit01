package htp.home.task01.main;

/*
 * Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за
 * три операции и а10 за четыре операции.
 */

public class Task27 {

	public static void main(String[] args) {
		
		int a = 2;
		
		int a2 = a * a;
		int a4 = a2 * a2;
		int a8 = a4 * a4;
		System.out.println("a в 8-ой степени равно " + a8);
		
		int a10 = a8 * a2;
		System.out.println("a в 10-ой степени равно " + a10);

	}

}
