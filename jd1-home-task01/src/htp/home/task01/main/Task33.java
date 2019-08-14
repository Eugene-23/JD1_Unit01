package htp.home.task01.main;

/*
 * Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
 */

public class Task33 {

	public static void main(String[] args) {
		
		char ch = 'k';
		
		int chCode = ch;
		
		int chPrev = chCode - 1;
		int chNext = chCode + 1;
		
		char chP = (char)chPrev;
		char chN = (char)chNext;
		
		System.out.println("Символ " + ch + " имеет код " + chCode);
		System.out.println("Предыдущий символ - " + chP + ", имеет код " + chPrev);
		System.out.println("Последующий символ - " + chN + ", имеет код " + chNext);

	}

}
