package htp.home.task01.main;

/*
 * Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
 * сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
 */

public class Task39 {

	public static void main(String[] args) {
		
		int x = 2;		
		int k = (((2 * x - 3)* x + 4)* x - 5)* x + 6;
		
		System.out.println(k);

	}

}
