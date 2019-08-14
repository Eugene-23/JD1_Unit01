package htp.home.task03.main;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
 * равен заданному е. Общий член ряда имеет вид:
 */

public class Task20 {

	public static void main(String[] args) {
		
		double e = 0.2;
        double sum = 0;

        double aMax = Math.abs( 1.0 / ((3 * 1 - 2)*(3 * 1 + 1)) );
        
        if (e > aMax) {
        	
            System.out.println("При заданном Е, нет членов ряда, модуль которых больше или равен числу Е");

        } else if (e <= aMax) {

            for(int i = 1; i <= 1; i++) {

               double ai = Math.abs( 1.0 / ((3 * i - 2)*(3 * i + 1)) );               
               
               sum = sum + ai;

            }

            System.out.println("При заданном Е, сумма членов ряда, модуль которых больше или равен числу Е = " + sum);

        }

	}

}
