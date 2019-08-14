package htp.home.task01.main;

/*
 * Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
 * информации.
 */

public class Task34 {

	public static void main(String[] args) {
		
		int Byte = 1275406684;
		double MegaByte = Byte / Math.pow(10, 6);
		double GigaByte = Byte / Math.pow(10, 9);
				
		System.out.println(Byte + " байт равно " + MegaByte + " мегабайт, и " + GigaByte + " гигабайт");

	}

}
