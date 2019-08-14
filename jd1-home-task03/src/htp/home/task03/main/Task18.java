package htp.home.task03.main;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
 * равен заданному е. Общий член ряда имеет вид:
 */

public class Task18 {

	public static void main(String[] args) {
		
		double e = 0.5;
        double sum = 0;

        double aMax = Math.abs( Math.pow( (-1), ((1-1) ) / 1) );

        if (e > aMax) {
        	
            System.out.println("При заданном Е, нет членов ряда, модуль которых больше или равен числу Е");

        } else if (e <= aMax) {

            for(int i = 1; i <= aMax; i++) {

                double ai = Math.abs( Math.pow( (-1), ((i-1) ) / i) );

                sum += ai;

            }
            
            System.out.println("При заданном Е, сумма членов ряда, модуль которых больше или равен числу Е = " + sum);

        }        

    }
	
}
