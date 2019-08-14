package htp.home.task01.main;

/*
 * Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */

public class Task28 {

	public static void main(String[] args) {
		
		double a = 1.28;				//радианы
		
		double b = Math.toDegrees(a); 	//градусы целая с дробной частью
		int x = (int)b; 				//!градусы целые         
		
		double c = b % 1;				//дробная часть градуса
		int y = (int)(c * 60);			//!минуты целые		 
		
		double d = (c * 60) % 1;		//остаток от минут		
		int z = (int)(d * 60);			//!секунды целые
		
		
		System.out.println(a + " радиан = " + x + " градусов " + y + " минут " + z + " секунд");

	}

}
