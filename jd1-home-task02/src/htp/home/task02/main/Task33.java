package htp.home.task02.main;

/*
 * Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. 
 * Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 
 * 9455, 8997 — доступен модуль базы С.
 */

public class Task33 {

	public static void main(String[] args) {
		
		int entPas = 9455;
		
		int pas1 = 9583;
		int pas2 = 1747;
		int pas3 = 3331;
		int pas4 = 7922;
		int pas5 = 9455;
		int pas6 = 8997;
		
		if ((entPas == pas1) || (entPas == pas2)) {
			System.out.println("доступны модули баз А, В, С");
			
		} else if ((entPas == pas3) || (entPas == pas4)) {
			System.out.println("доступны модули баз В, С");
			
		} else if ((entPas == pas5) || (entPas == pas6)) {
			System.out.println("доступен модуль базы С");
			
		} else {
			System.out.println("Введен неверный пароль");
			
		}

	}

}
