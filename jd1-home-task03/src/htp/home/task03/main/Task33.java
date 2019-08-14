package htp.home.task03.main;

/*
 * Найдите наибольшую цифру данного натурального числа.
 */

public class Task33 {

	public static void main(String[] args) {
		
		int N = 540962130;		
		
        int T; 
        int max = 0;
        
        System.out.println("число N = " + N);
        
        while(N > 0){        	        	
            
            T = N%10;             
            if (T > max) {
            	max = T;
            }
            
            N /= 10;            
            
        }
             
        System.out.println("наибольшая цифра данного натурального числа N = " + max);

	}

}
