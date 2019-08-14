package htp.home.task03.main;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти
 * компьютера (Таблицу ASCII).
 */

public class Task26 {

	public static void main(String[] args) {
		
		for (int i = 33; i <= 126; i++) {
			System.out.println(i + " > " + (char)i);			
			
		}

	}

}
