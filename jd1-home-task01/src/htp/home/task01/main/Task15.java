package htp.home.task01.main;

/*
 * Написать программу, которая выводит на экран первые четыре степени числа π.
 */

public class Task15 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			double Pi = Math.PI;
			double P2 = Math.pow(Pi, i);
			System.out.println("Пи в " + i + " степени равно " + P2);
		}	
		
	}

}
