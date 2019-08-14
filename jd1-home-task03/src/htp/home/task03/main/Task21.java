package htp.home.task03.main;

/*
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции: F(x) = x - sin(x)
 */

public class Task21 {

	public static void main(String[] args) {
		
		int a, b;
        double x, Fx, h;
        
        a = 2;
        b = 5;
        
        h = 0.5;
        
        System.out.println(" ----------------------------------- ");
        
        for (x = a; x <= b; x += h ) {
        	
            System.out.print("| x = " + x + " | ");
            
            Fx = x - Math.sin(x);
            System.out.println("Fx = " + Fx + " | ");    
            
            System.out.println(" ----------------------------------- ");
            
        }
                
	}

}
