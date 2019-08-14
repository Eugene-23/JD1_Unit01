package htp.home.task03.main;

/*
 * Найдите количество четных цифр данного натурального числа.
 */

public class Task35 {

	public static void main(String[] args) {
		
		int N = 348174216;		
		
		int T; 
        int count = 0;
        
        System.out.println("число N = " + N);
        
        while(N > 0){        	        	
            
            T = N%10;             
            
            if ((T%2) == 0) {
            	count ++;
            }
            
            N /= 10;            
            
        }
             
        System.out.println("количество четных цифр данного натурального числа N = " + count);

	}

}
