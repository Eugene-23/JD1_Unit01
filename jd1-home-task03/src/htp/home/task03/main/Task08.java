package htp.home.task03.main;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task08 {

	public static void main(String[] args) {

		int a, b;
        double c, x, y, h;
        
        a = 10;
        b = 16;
        c = 3;
        h = 0.5;
        
        for (x = a; x <= b; x += h ) {
        	
            System.out.print("x= " + x + ", ");
            
            if (x == 15) {  
            	y = (x + c) * 2;
            	System.out.println("y = " + y);
            
            } else if (x != 15) {            	
                y = (x - c) + 6;
                System.out.println("y = " + y);
 
            }   
            
        }

	}

}
