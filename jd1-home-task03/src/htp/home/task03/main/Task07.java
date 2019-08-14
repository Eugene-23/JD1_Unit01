package htp.home.task03.main;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task07 {

	public static void main(String[] args) {
		
		int a, b;
        double x, y, h;
        
        a = 0;
        b = 5;
        h = 0.5;
        
        for (x = a; x <= b; x += h ) {
        	
            System.out.print("x= " + x + ", ");
            
            if (x > 2) {  
            	y = x;
            	System.out.println("y = " + y);
            
            } else if (x <= 2) {            	
                y = (-1) * x;
                System.out.println("y = " + y);
 
            }   
            
        }

	}

}
