package htp.home.task02.main;

/*
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		
		Scanner sc = new Scanner(System.in);
		String x;
		String St1 = "Д";
		String St2 = "М";
		
		System.out.print("> ");
		
		x = sc.nextLine();
		
		if (x.equals(St1)) {
			System.out.println("Мне нравятся девочки!");
			
		} else if (x.equals(St2)) {
			System.out.println("Мне нравятся мальчики!");
			
		} else {
			System.out.println("Введено неверное значение.");
			
		}
		
		sc.close();		
	}

}
