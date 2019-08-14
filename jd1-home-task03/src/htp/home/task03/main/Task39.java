package htp.home.task03.main;

/*
 * В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
 * получили исходное число. Найти это число.
 */

public class Task39 {

	public static void main(String[] args) {
				
		for (int i = 100; i <= 999; i++) {
			
			int k = i % 100;		
			
			if ((k * 7) == i) {				
					
				System.out.println("Число = " + i);												
				
			}			
			
		}

	}

}
