package com.cg;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.*;
import java.util.Scanner;

public class FormatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DateTimeFormatter df1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
			LocalDate  today=LocalDate.now();
			System.out.println(today);
			String dateOfToday=df1.format(today);  // localdate into differnt format date string
			System.out.println(dateOfToday);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Accept date of join of pattern dd/MM/yyyy");
			String sdoj=sc.next();
			//String sdoj="20/05/2019";
			DateTimeFormatter df2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate doj=LocalDate.parse(sdoj,df2);// converts String date as per the format into localdate
			System.out.println("Date of joining "+doj);
			
			// if pattern is different then it throws following Exception
			//Exception in thread "main" java.time.format.DateTimeParseException: Text 'dfdf' could not be parsed at index 0
			
	}

}
