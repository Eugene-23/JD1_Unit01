package htp.home.task03.main;

/*
 * Необходимо вывести на экран таблицу умножения на 3:
 */

public class Task03 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <= 3; j++) {
				
				System.out.print((i * j) + " ");
				
			}
			
			System.out.println("");
						
		}

	}

}
