package htp.home.task03.main;

/*
 * Для заданного натурального числа определить, образуют ли его цифры арифметическую
 * прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
 */

public class Task38 {

	public static void main(String[] args) {

		int N = 7531;
		int n1 = N % 10; 
		int n2 = (N - n1) / 10 % 10; 
		
		int h = n1 - n2; 	//шаг
		
		int x1 = 0;
		int x2 = 0;
		int y = 0;
		
		int N1 = N;

		while (N > 10) {

			x1 = N % 10;
			x2 = (N - x1) / 10 % 10;
			N = (N - x1) / 10;
			
			if (x1 - x2 == h) {
				y = h;
				
			} else {
				y = 404;
			}

		}	
				
		if (y == h) {
			System.out.println("Цифры числа " + N1 + " образуют арифметическую прогрессию");
		} else {
			System.out.println("Цифры числа " + N1 + " НЕ образуют арифметическую прогрессию");
		}

	}

}
