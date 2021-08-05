package com.cg;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class PeriodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		  System.out.println("Current Date="+today);
		  
		  LocalDate ind=LocalDate.of(1947, Month.AUGUST, 15);
		  System.out.println("India's indepedence day "+ind);
		  
		  Period p=ind.until(today);
		  System.out.println("Days "+p.get(ChronoUnit.DAYS));
		  System.out.println("Months "+p.get(ChronoUnit.MONTHS));
		  System.out.println("Years "+p.get(ChronoUnit.YEARS));
		  
		  Period fiveDays=Period.ofDays(5);
		  
		  LocalDate dateAfterFive=today.plus(fiveDays);
		  System.out.println("Date after five days "+dateAfterFive);
		  
		  Period sixm=Period.ofMonths(6);
		  LocalDate sixmd= today.plus(sixm);
		  System.out.println("Date after six month "+sixmd);
		  
		  Period pp=Period.between(dateAfterFive, sixmd);
		  System.out.println(pp);
		  System.out.println("Days "+pp.get(ChronoUnit.DAYS));
		  System.out.println("Months "+pp.get(ChronoUnit.MONTHS));
		  
		  Period p1=Period.of(1, 7, 20); // years,months,days
		  
		  
		  
	}

}
