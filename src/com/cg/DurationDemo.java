package com.cg;
import java.time.*;
public class DurationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime=LocalTime.now();
		System.out.println("Current time "+currentTime);
		Duration sevenHour=Duration.ofHours(7);
		
		
		LocalTime afterSeven=currentTime.plus(sevenHour);
		System.out.println("After seven hour "+afterSeven);
	}

}
