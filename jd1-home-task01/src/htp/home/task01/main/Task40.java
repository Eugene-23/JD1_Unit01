package htp.home.task01.main;

/*
 * Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
 */

public class Task40 {

	public static void main(String[] args) {

		int x = 2;		
		
		int k = x*((-2)+ x*(3 - 4*x));
		
		int l = 1 + x*(2 + x*(3 + 4*x));
		
		System.out.println(k);
		System.out.println(l);
		
	}

}
