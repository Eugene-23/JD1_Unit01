package htp.home.task03.main;

/*
 * Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
 * первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
 * буквами, цифрами и знаком подчеркивания.
 */

public class Task32 {

	public static void main(String[] args) {
		
		String s = "4f%g65_h/14";
		
		if ( ((65 <= (int)s.charAt(0)) && ((int)s.charAt(0) <= 90)) || ((int)s.charAt(0) == 95) || 
				((97 <= (int)s.charAt(0)) && ((int)s.charAt(0) <= 122)) ) {
			
		} else {
			System.out.println("1-й символ недопустимый");
		}
		
		for (int i = 1; i < s.length(); i++) {
			
			if ( ((48 <= (int)s.charAt(i)) && ((int)s.charAt(i) <= 57)) || ((65 <= (int)s.charAt(i)) && ((int)s.charAt(i) <= 90)) ||
					((int)s.charAt(i) == 95) || ((97 <= (int)s.charAt(i)) && ((int)s.charAt(i) <= 122)) ) {				
				
			} else {
				System.out.println((i+1) + "-й символ недопустимый");
			}
			
		}

	}

}
