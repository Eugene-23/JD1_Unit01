package htp.home.task02.main;

/*
 * Даны три числа a, b, с. Определить, какое из них равно d. 
 * Если ни одно не равно d, то найти max(d — a, d — b, d —c).
 */

public class Task28 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		int c = 7;
		
		int d = 6;
		
		int da = d - a;
		int db = d - b;
		int dc = d - c;
		
		int max = 0;
		
		if (d == a) {
			System.out.println("a = d");			
		}
		
		if (d == b) {
			System.out.println("b = d");			
		}
		
		if (d == c) {
			System.out.println("c = d");			
		}
		
		if ((d != a) && (d != b) && (d != c)) {
			
			if ((da <= db) && (db < dc)) {				
				max = dc;
				
			}
			
			if ((dc <= db) && (db < da)) {				
				max = da;
				
			}
			
			if ((dc <= da) && (da < db)) {				
				max = db;
				
			}		
			
			System.out.println("max(d — a, d — b, d — c) = " + max);
			
		}

	}

}
