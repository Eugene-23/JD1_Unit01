package htp.home.task03.main;

/*
 * Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
 * делится на их произведение. Найти эти числа.
 */

public class Task36 {

	public static void main(String[] args) {
		
		System.out.println("Два двузначных числа, образующих четырёхзначное число, которое делится на их произведение: ");
		
		for (int i = 1000; i <= 9999; i++) {
			
			int k = i / 1000;
			int l = (i % 1000) / 100;
			int m = (i % 100) / 10;
			int n = i % 10;
			
			int num1 = (k*10) + l;
			int num2 = (m*10) + n;
			
			int mul = num1 * num2;
			
			if ((n != 0) && (m != 0)) {
				
				if (i % mul == 0) {
					System.out.print(num1 + " и " + num2 + ";  ");
					
				}				
				
			}
			
		}

	}

}
