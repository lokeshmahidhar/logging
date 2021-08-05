package com.cg;
import java.time.*;
public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println("Today's Date and Time with zone "+zdt);

		ZonedDateTime datetimeparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Today's Date and time in Paris "+datetimeparis);
		
		
		
		
		
	}

}
