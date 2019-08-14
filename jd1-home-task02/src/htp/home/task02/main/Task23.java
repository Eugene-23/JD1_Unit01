package htp.home.task02.main;

/*
 * Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом.
 */

public class Task23 {

	public static void main(String[] args) {
		
		int day = 31;
		int month = 12;
		
		if ((month == 1) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " января");
			
		} else if ((month == 2) && (1 <= day) && (day <= 28)) {
			System.out.println(day + " февраля");
			
		} else if ((month == 3) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " марта");
			
		} else if ((month == 4) && (1 <= day) && (day <= 30)) {
			System.out.println(day + " апреля");
			
		} else if ((month == 5) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " мая");
			
		} else if ((month == 6) && (1 <= day) && (day <= 30)) {
			System.out.println(day + " июня");
			
		} else if ((month == 7) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " июля");
			
		} else if ((month == 8) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " августа");
			
		} else if ((month == 9) && (1 <= day) && (day <= 30)) {
			System.out.println(day + " сентября");
			
		} else if ((month == 10) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " октября");
			
		} else if ((month == 11) && (1 <= day) && (day <= 30)) {
			System.out.println(day + " ноября");
			
		} else if ((month == 12) && (1 <= day) && (day <= 31)) {
			System.out.println(day + " декабря");
			
		} else {
			System.out.println("введены некорректные данные");
			
		}

	}

}
