package htp.home.task01.main;

/*
 * Даны два действительных числа х и у. 
 * Вычислить их сумму, разность, произведение и частное.
 */

public class Task01 {

	public static void main(String[] args) {
		
		int x = 21;
		int y = 7;
		
		int z1 = x + y;
		int z2 = x - y;
		int z3 = x * y;
		int z4 = x / y;
		
		System.out.println("Сумма равна " + z1);
		System.out.println("Разность равна " + z2);
		System.out.println("Произведение равно " + z3);
		System.out.println("Частное равно " + z4);
		
	}

}
