package htp.home.task02.main;

/*
 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */

public class Task07 {

	public static void main(String[] args) {
		
		double a = -7;
        double b = 3;
        double c = 5;
        double x = -9;


        double p = Math.abs(a*x*x + b*x + c);

        System.out.println("модуль выражения равен " + p);


	}

}
