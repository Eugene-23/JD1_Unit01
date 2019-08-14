package htp.home.task01.main;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task21 {

	public static void main(String[] args) {
		
		double R = 111.222;
		
		int a = (int)(R * 1000) % 1000; // 222
		int b = (int)(R);  			    // 111
		double c = ((double)b / 1000) + a;
		
		System.out.println(c);
		

	}

}
