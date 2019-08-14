package htp.home.task03.main;

/*
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

public class Task14 {

	public static void main(String[] args) {
		
		int n = 7;
		double sum = 0;
		
		for(double i = 1; i <= n; i++) {
			
			sum += 1/i;			
			
		}
		
		System.out.println(sum);

	}

}
