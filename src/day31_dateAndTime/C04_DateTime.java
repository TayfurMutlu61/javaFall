package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C04_DateTime {

	public static void main(String[] args) {
		 LocalTime saatS=LocalTime.now();
	        System.out.println("baslangic saati: "+saatS);
	        		
	        
	      String str="Celil";
	      
	       for (int i = 0; i <10000; i++) {
	    	   str+=" ";
		}

	        System.out.println("Bitis saati: "+saatS);
	        
	        LocalTime saatBitisS=LocalTime.now();
	        
	        System.out.println("Bitis saati: "+saatBitisS);
	        
	        
	        double nano1=saatS.getNano();
	        
	        double nanoBitisS=saatBitisS.getNano();
	        
	        System.out.println("For loop "+(nanoBitisS-nano1)+" nano saniyede tamamladi");
	        
	     
	        
	        LocalTime saat=LocalTime.now();
	        System.out.println("baslangic saati: "+saat);
	        		
	        
	        int sayi=10;
	        
	        for (int i = 0; i < 10000; i++) {
				sayi++;
				
			}

	        System.out.println("Bitis saati: "+saat);
	        
	        LocalTime saatBitis=LocalTime.now();
	        
	        System.out.println("Bitis saati: "+saatBitis);
	        
	        double nano3=saat.getNano();
	        
	        double nanoBitis=saatBitis.getNano();
	        
	        System.out.println("For loop "+(nanoBitis-nano3)+" nano saniyede tamamladi");
	        
	        System.out.println();
	        
	        System.out.println(saat.getMinute());
	        System.out.println(saat.plusMinutes(600000));
	        
	        
	        LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
	        System.out.println(yerelSaat);
	        
		
	}

}
