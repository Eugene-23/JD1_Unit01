package htp.home.task03.main;

/*
 * Последовательность аn строится так: а1 = 1, an =n+ аn-1 , для каждого n >1 Составьте программу
 * нахождения произведения первых 10 членов этой последовательности.
 */

public class Task12 {

	public static void main(String[] args) {	
		
		long res = 1;
		int ai1 = 1;
		int ai = 0;
		
		for(int i = 2; i <= 10; i++) {			
			
			ai = i + ai1;
			
			res = res * ai;
			
			ai1 = ai;
			
		}
		    
		System.out.println("произведения первых 10 членов этой последовательности = " + res); 

	}

}
