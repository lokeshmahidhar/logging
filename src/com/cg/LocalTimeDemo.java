package com.cg;
import java.time.*;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime=LocalTime.now();
		LocalTime aa=LocalTime.of(03, 15);
		
		System.out.println(aa);
		System.out.println("Current time "+currentTime);
		System.out.println("After one hour "+currentTime.plusHours(1));
		System.out.println("Before 30 minuites "+currentTime.minusMinutes(30));
	}

}
