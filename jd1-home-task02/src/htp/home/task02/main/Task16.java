package htp.home.task02.main;

/*
 * На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси или в каком координатном угле).
 */

public class Task16 {

	public static void main(String[] args) {
		
		double x = -5;
		double y = 3;
		
		if ((x == 0) && (y == 0)) {
			System.out.println("Точка расположена в начале координат");
		
		} else if (x == 0) {
			System.out.println("Точка расположена на оси X");
			
		} else if (y == 0) {
			System.out.println("Точка расположена на оси Y");
			
		} else if ((x > 0) && (y > 0)) {
			System.out.println("Точка расположена в I координатной четверти");
			
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Точка расположена во II координатной четверти");
			
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Точка расположена в III координатной четверти");
			
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Точка расположена в IV координатной четверти");
			
		}

	}

}
