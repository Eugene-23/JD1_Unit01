package htp.home.task03.main;

import java.io.IOException;
import java.util.Scanner;

/*
 * Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
 * результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
 * также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
 * перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
 */

public class Task28 {

	public static void main(String[] args) throws IOException {
		
		double x, y;
	    
	    double z = 0;
	    int end = 1;
	    char ch;	      
	    
	    do {
	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Введите операнд X > ");
		    x = sc.nextInt();
		    
		    System.out.print("Введите операнд Y > ");
		    y = sc.nextInt(); 
		    
		    System.out.print("Введите знак операции (+, –, /, *) > ");
		    ch = (char) System.in.read();
	    
	      switch (ch) {
	      
	       case ('+') :	       
	        z = x + y;
	        System.out.println("Результат вычислений = " + z);
	        break;	        	       
	      
	      case ('-') :	       
	        z = x - y;
	        System.out.println("Результат вычислений = " + z);
	        break;	      
	      
	      case ('*') :	       
	        z = x * y;
	        System.out.println("Результат вычислений = " + z);
	        break;
	      
	      case ('/') :	       
	       if (y != 0) {
	        z = x / y;
	        System.out.println("Результат вычислений = " + z);
	        
	       } else {
	        System.out.println("некорректное значение Y, попробуйте еще раз");	        
	       }
	      break; 
	      	      	      
	      default :
	        System.out.println("Введен неверный знак операции, попробуйте еще раз");
	        break;	    
	        
	      }  	      
	      
	      System.out.print("Для прекращены вычислений введите 0. Для продолжения вычислений введите 1 > "); 
	      end = sc.nextInt();
	      
	    } while (end != 0);      	      
	    		    	    
	    System.out.println("вычисления прекращены");   	    
	    

	}

}
