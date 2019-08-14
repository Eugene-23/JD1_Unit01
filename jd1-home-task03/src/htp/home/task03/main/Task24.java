package htp.home.task03.main;

/*
 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
 * его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
 * числом.
 */

public class Task24 {

	public static void main(String[] args) {
		
		int N = 12345678;
        int R = 0;
        int sum = 0;
        
        System.out.println("число = " + N);
        while(N > 0){
        	
        	if ((N % 10) % 2 == 0 ) {
        		sum += N % 10;        		
        	}
        	
            R *= 10;            
            R += N%10;            
            N /= 10;            
            
        }
        
        System.out.println("сумма четных цифр, входящих в состав числа = " + sum);
        System.out.println("число с обратным порядком цифр = " + R);
		

	}

}
