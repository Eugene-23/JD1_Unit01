package htp.home.task02.main;

/*
 * Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; 
 * если сдачи не требуется, печатает на экране «спасибо»; 
 * если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; 
 * если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */

public class Task34 {

	public static void main(String[] args) {
		
		double cost = 59.2;		//стоимость книги
		double amount = 50;		//размер внесенных денег
		
		double change = amount - cost;
		
		if (change == 0) {
			System.out.println("спасибо");						
		}
		
		if (change > 0) {
			System.out.print("возьмите сдачу ");
			System.out.printf("%.2f", change);			
		}
		
		if (change < 0) {
			change = change * (-1);
			System.out.print("недостаточно денег, доплатите ");			
			System.out.printf("%.2f", change);
			
		}

	}

}
