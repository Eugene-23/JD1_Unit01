package htp.home.task01.main;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class Task22 {

	public static void main(String[] args) {
		
		int t = 3685;
		int HH = t / 3600;
		int MM = (t % 3600) / 60;
		int SS = t % 60;
		
		System.out.println(HH + "ч " + MM + "мин " + SS + "с");

	}

}
