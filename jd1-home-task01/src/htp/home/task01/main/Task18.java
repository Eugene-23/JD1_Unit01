package htp.home.task01.main;

/*
 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */

public class Task18 {

	public static void main(String[] args) {
		
		int a = 5;		 //длина ребра куба
		
		int s1 = a * a;	 //площадь грани
		int s2 = s1 * 6; //площадь полной поверхности куба
		int v = s1 * a;	 //объем куба
				
		System.out.println("площадь грани " + s1);
		System.out.println("площадь полной поверхности куба " + s2);
		System.out.println("объем куба " + v);

	}

}
