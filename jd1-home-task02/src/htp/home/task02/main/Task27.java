package htp.home.task02.main;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task27 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 6;
		int c = 5;	
		int d = 8;
		
		int minAB = 0;
		int minCD = 0;
		int max = 0;
		
		if (a <= b) {	//min AB
			minAB = a;			
		} else {
			minAB = b;
		}
		
		if (c <= d) {	//min CD
			minCD = c;			
		} else {
			minCD = d;
		}
		
		if (minAB >= minCD) {		//max
			max = minAB;
		} else {
			max = minCD;
		}
		
		System.out.println("max{min(a, b), min(c, d)} = " + max);

	}

}
