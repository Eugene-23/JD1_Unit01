package htp.home.task03.main;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task29 {

	public static void main(String[] args) {
		
		int N = 54054510;
		int M = 32510251;
		
        int R = 0;  
        int K = 0;
        
        System.out.println("число N = " + N);
        System.out.println("Цифры, входящие в состав числа N: ");
        
        while(N > 0){        	        	
            
            R = N%10;                     
            System.out.print(R + ", ");
            N /= 10;            
            
        }
             
        System.out.println('\n' + "число M = " + M);
        System.out.println("Цифры, входящие в состав числа M: ");
        
        while(M > 0){        	
        	        	
            K = M%10;                        
            System.out.print(K + ", ");
            M /= 10;            
            
        }

	}

}
