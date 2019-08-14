package htp.home.task03.main;

/*
 * Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
 */

public class Task17 {

	public static void main(String[] args) {
		
		int a = 5;
		int n = 3;
		
		int res = 1;
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {			
			
			sum = a + (i - 1);			
			
			res = res * sum;			
			
		}
		    
		System.out.println(res); 

	}
	
}
