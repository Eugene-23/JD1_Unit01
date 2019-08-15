package htp.home.task03.main;

import java.util.Random;
import java.util.Scanner;

/*
 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
 * угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
 * программа, а также ошибочные числа пользователя.
 */

public class Task31 {

	public static void main(String[] args) {
		
		System.out.println("Компьютер сгенерировал числа:");
		
		int[] mas = new int[5];
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(15) + 1;
		}
		
		for(int i = 0; i < mas.length; i++) {
			System.out.println(i+1 + " число = " + mas[i]); 
		}		
		
		System.out.println("-----------------------------");
		System.out.println("Введите ваши числа от 1 до 15:");
		
		int[] mas2 = new int[5];
				
		for(int j = 0; j < mas2.length; j++) {			
			
			System.out.print(j+1 + "> ");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);	        
			
			mas2[j] = sc.nextInt();
			
		}
		
		System.out.println("-----------------------------");
		System.out.println("Результат сравнения:");		
						
		for(int i = 0; i < mas.length; i++) {	
			int k = i;
			
			for(int j = 0; j < mas2.length; j++) {
								
				if (mas[i] == mas2[j]) {
					System.out.println("   угадано число " + mas[i]);
					k = i+1;
				} 
								 
			}
			if (k != i+1) {
				System.out.println("не угадано число " + mas[i]);
				
			} 
			
		}

	}

}
