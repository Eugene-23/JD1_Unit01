package htp.home.task01.main;

/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае:
 * • Целое число N является четным двузначным числом.
 * • Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
 * • Сумма цифр данного трехзначного числа N является четным числом.
 * • Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
 * • Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
 * • Треугольник со сторонами а,b,с является равнобедренным.
 * • Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
 * • Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
 * • График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
 */

public class Task37 {

	public static void main(String[] args) {
		
		boolean res1, res2, res3, res4, res5, res6, res7, res8, res9;
		
		int N1 = 32;					//1)
		
		if ( ((N1 > 9 && N1 < 100) || (N1 < -9 && N1 > -100)) && (N1 % 2 == 0) ) {
			res1 = true;
			
		} else {
			res1 = false;
			
		}
		
		System.out.println("1) " + res1);
		
		
		int N2 = 3213;					//2)
		
		int n1 = N2 / 1000;
		int n2 = N2 %1000 / 100; 
		int n3 = N2 %100 / 10;
		int n4 = N2 %10;
		
		if ( (n1 + n2) == (n3 + n4) ) {
			res2 = true;
			
		} else {
			res2 = false;
			
		}
		
		System.out.println("2) " + res2);
		
		
		int N3 = 321;					//3)
				
		int m1 = N3 / 100; 
		int m2 = N3 %100 / 10;
		int m3 = N3 %10;
		
		if ( (m1 + m2 + m3) % 2 == 0 ) {
			res3 = true;
			
		} else {
			res3 = false;
			
		}
		
		System.out.println("3) " + res3);
		
		
		int x = 3;						//4)
		//int y = 2;
		
		int m = 1;
		int n = 4;
		
		if (m < n) {
			if ((m <= x) && (x <= n)) {
				res4 = true;
				
			} else {
				res4 = false;
				
			}			
			
		} else {
			res4 = false;
			
		}
		
		System.out.println("4) " + res4);
		
		
		int N5 = 321;					//5)
		
		int k1 = N3 / 100; 
		int k2 = N3 %100 / 10;
		int k3 = N3 %10;
		
		if ( (N5*N5) == ((k1+k2+k3)*(k1+k2+k3)*(k1+k2+k3)) ) {
			res5 = true;
			
		} else {
			res5 = false;
			
		}
		
		System.out.println("5) " + res5);
		
		
		int a = 12;						//6)
		int b = 9;
		int c = 12; 
		
		if ( (a == b) || (b == c) || (a == c) ) {
			res6 = true;
			
		} else {
			res6 = false;
			
		}
		
		System.out.println("6) " + res6);
		
		
		int N7 = 459;					//7)
		
		int L1 = N7 / 100; 
		int L2 = N7 %100 / 10;
		int L3 = N7 %10;
		
		if ( ((L1+L2) == L3) || ((L1+L3) == L3) || ((L3+L3) == L3) ) {
			res7 = true;
			
		} else {
			res7 = false;
			
		}
		
		System.out.println("7) " + res7);
		
		
		int N8 = 8;						//8)
		int a1 = 2;
				
		if ( (N8 == 1) || (N8 == a1) || (N8 == a1*a1) || (N8 == a1*a1*a1) || (N8 == a1*a1*a1*a1) ) {
			res8 = true;
			
		} else {
			res8 = false;
			
		}
		
		System.out.println("8) " + res8);
		
				
		double a9 = 4;					//9)
		double b9 = -2;
		double c9 = -3;
						
		double m9 = 2;
		double n9 = 9;
		
		if (n9 == a9 * m9 * m9 + b9 * m9 + c9) {
			res9 = true;
			
		} else {
			res9 = false;
			
		}		

		System.out.println("9) " + res9);		

	}

}
