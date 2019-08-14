package htp.home.task02.main;

/*
 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, 
 * равным большему из исходных, а если равны, то заменить числа нулями.
 */

public class Task17 {

	public static void main(String[] args) {
		
		int m = 6;
		int n = 5;
		
		if (m != n) {
			
			if (m > n) {
				n = m;
				
			} else if (m < n) {
				m = n;				
				
			}			
			
		} else if (m == n) {
			m = 0;
			n = 0;			
			
		}
		
		System.out.println("m = " + m + ", n = " + n);

	}

}
