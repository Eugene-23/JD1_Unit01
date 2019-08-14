package htp.home.task01.main;

/*
 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
 */

public class Task13 {

	public static void main(String[] args) {

        double x1 = 2;   //точка A
        double y1 = 3;

        double x2 = 6;   //точка B
        double y2 = 9;

        double x3 = 7;   //точка C
        double y3 = 3;

        double ab = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double bc = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
        double ac = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));

        double p = ab + bc + ac;

        double pl = (ab + bc + ac)/2;    //полупериметр

        double s = Math.sqrt(pl * (pl-ab) * (pl-bc) * (pl-ac));

        System.out.println("периметр " + p);
        System.out.println("пплощадь " + s);

    }
}
