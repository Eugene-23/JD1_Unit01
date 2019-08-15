package htp.home.task03.main;

/*
 * Написать программу, переводящую римские цифры в арабские.
 */

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		
		int intValue = 0;

        char ch;

        System.out.print("Введите Римское число > ");

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            ch = s.charAt(i);

            int num = 0;

            if ( ((s.charAt(i) == 'X') || (s.charAt(i) == 'V')) && (i > 0)) {
            	
                if (s.charAt(i-1) == 'I') {
                	intValue -= 2;                	
                }
            }

            switch (ch) {
                case 'I':  num = 1;
                    break;
                case 'V':  num = 5;
                    break;
               case 'X':  num = 10;
                    break;
                case 'L':  num = 50;
                    break;
                case 'C':  num = 100;
                    break;
                case 'D':  num = 500;
                    break;
                case 'M':  num = 1000;
                    break;

                default:
                    System.out.println("Введены недопустимые символы");
                    break;
            }

            intValue += num;
        }

        System.out.println("Арабское число = " + intValue);
	}

}
