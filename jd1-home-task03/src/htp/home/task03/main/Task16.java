package htp.home.task03.main;

/*
 * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */

public class Task16 {

	public static void main(String[] args) {
		
		int sum = 0;
		long res = 1;
		int i1 = 1;
		
		for(int i = 2; i <= 10; i++) {			
			
			sum = i1 + i;
			i1 = sum;
			res *= sum; 			
			
		}
		    
		System.out.println(res);

	}

}
