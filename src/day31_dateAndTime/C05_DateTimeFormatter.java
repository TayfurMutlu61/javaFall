package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {

		// * yy: Yilin son iki rakamini
//		 * y:    Yilin tamamini
//		 * M:    Ay sirasini verir
//		 * MM:   Ay sirasini verir
//		 * MMM:  Ay isminin ilk uc harfini verir
//		 * MMMM: Ay isminin tamamini verir
//		 *  Ay buyuk M ile belirtilmeli dakika( minute) ile
//		 *  cakismamasi icin.

		LocalDateTime tarihSaat = LocalDateTime.now();

		System.out.println(tarihSaat); // 2021-12-02T21:45:17.601345700

		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MMMMM / yyyy eeeee : mm ");
		System.out.println(duzenle.format(tarihSaat));
		
		
	}

}
