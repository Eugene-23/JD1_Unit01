package htp.home.task01.main;

/*
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
 */

public class Task11 {

	public static void main(String[] args) {

        double a = 6;
        double b = 9;

        double c = Math.sqrt(a*a + b*b);

        double s = a * b / 2;
        double p = a + b + c;

        System.out.println("площадь прямоугольного треугольника " + s);
        System.out.println("периметр прямоугольного треугольника " + p);
    }
}
