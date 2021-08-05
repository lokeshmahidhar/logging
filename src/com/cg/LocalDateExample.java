package com.cg;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
/**
 * LocalDate Examples
 *
 */
public class LocalDateExample {
 public static void main(String[] args) {
  
  //Current Date
  LocalDate today = LocalDate.now();
  System.out.println("Current Date="+today);
  
  LocalDate ind=LocalDate.of(1947, Month.AUGUST, 15);
  System.out.println("India's indepedence day "+ind);
  
  //following date will give the exception
  //Exception in thread "main" java.time.DateTimeException: Invalid date 'February 29' as '2003' is not a leap year
  //LocalDate wrong_date=LocalDate.of(2003, Month.FEBRUARY, 29);
  //System.out.println("Wrong Date "+wrong_date);
  
  System.out.println("Tomarrow "+today.plusDays(1));
  System.out.println("Last Month "+today.minusMonths(1));
  System.out.println("Is leap year "+ today.isLeapYear());
  System.out.println("Move to 28th day of month "+today.withDayOfMonth(28));
  
  System.out.println(today.getDayOfMonth());
  
  System.out.println(today.getDayOfWeek());
  
  
  
  
  
  
  }
}
