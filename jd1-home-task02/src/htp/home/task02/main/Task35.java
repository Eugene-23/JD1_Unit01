package htp.home.task02.main;

/*
 * Вычислить число и месяц в невисокосном году по номеру дня.
 */

public class Task35 {

	public static void main(String[] args) {
		
		int d = 328;		//номер дня в году
		
		
		int d1 = 0;
		
		if ((1 <= d) && (d <= 31)) {	
			d1 = d - 0;
			System.out.println(d1 + " января");
			
		} else if ((32 <= d) && (d <= 59)) {	
			d1 = d - 31;
			System.out.println(d1 + " февраля");
			
		} else if ((60 <= d) && (d <= 90)) {	
			d1 = d - 59;
			System.out.println(d1 + " марта");
			
		} else if ((91 <= d) && (d <= 120)) {	
			d1 = d - 90;
			System.out.println(d1 + " апреля");
			
		} else if ((121 <= d) && (d <= 151)) {	
			d1 = d - 120;
			System.out.println(d1 + " мая");
			
		} else if ((152 <= d) && (d <= 181)) {	
			d1 = d - 151;
			System.out.println(d1 + " июня");
			
		} else if ((182 <= d) && (d <= 212)) {	
			d1 = d - 181;
			System.out.println(d1 + " июля");
			
		} else if ((213 <= d) && (d <= 243)) {	
			d1 = d - 212;
			System.out.println(d1 + " августа");
			
		} else if ((244 <= d) && (d <= 273)) {	
			d1 = d - 243;
			System.out.println(d1 + " сентября");
			
		} else if ((274 <= d) && (d <= 304)) {	
			d1 = d - 273;
			System.out.println(d1 + " октября");
			
		} else if ((305 <= d) && (d <= 334)) {	
			d1 = d - 304;
			System.out.println(d1 + " ноября");
			
		} else if ((335 <= d) && (d <= 365)) {	
			d1 = d - 334;
			System.out.println(d1 + " декабря");
			
		} else {				
			System.out.println("Такого дня не существует");
			
		}

	}

}
