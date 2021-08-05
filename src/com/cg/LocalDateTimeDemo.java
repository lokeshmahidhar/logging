package com.cg;
import java.time.*;
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalDateTime today=LocalDateTime.now();
			System.out.println("Current Date and Time "+today);
			// Start of the year
			
			LocalDate startDate=LocalDate.of(2019, Month.JANUARY, 1);
			LocalTime startTime=LocalTime.of(00, 1,44,666);
			LocalDateTime start=LocalDateTime.of(startDate, startTime);
			System.out.println("Start of the year "+start);
			
	}

}
