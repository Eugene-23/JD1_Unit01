package htp.home.task01.main;

/*
 * Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
 */

public class Task12 {

	public static void main(String[] args) {

        double x1 = 2;
        double y1 = 3;

        double x2 = 6;
        double y2 = 9;

        double ab = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));

        System.out.println("расстояние между двумя точками " + ab);

    }
}
