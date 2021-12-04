package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		
		LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getMonthValue());
        
        
        
        System.out.println(tarih.plusDays(571));
        System.out.println(tarih.plusWeeks(15));
        System.out.println(tarih.plusMonths(5));
        System.out.println(tarih.plusYears(4));
        
        
        System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));
        System.out.println(tarih.minusDays(1000));
        System.out.println(tarih.minusWeeks(7));
        System.out.println(tarih.minusYears(28).minusMonths(4).minusDays(4));
        System.out.println(tarih.minusYears(21).isLeapYear());
        
        
        LocalDate dogumTarihi1=LocalDate.of(1993, Month.AUGUST,30);
        
        LocalDate dogumTarihi2=LocalDate.of(2000, 01,01);
        LocalDate dogumTarihi3=LocalDate.ofYearDay(2000,100);
        System.out.println(dogumTarihi3);
        System.out.println(dogumTarihi1);
        System.out.println(dogumTarihi2);
        
        System.out.println(dogumTarihi1.isAfter(dogumTarihi2));
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
