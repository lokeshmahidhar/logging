package com.cg;
import java.time.*;

public class Demo1 {
	public static void main(String[] args) {
		LocalDate vd= LocalDate.of(2015,Month.FEBRUARY,14);
		LocalDate vd115=vd.plusDays(15);
		System.out.println(vd115);
		LocalDate nd=vd115.plusYears(1);
		System.out.println(nd);
	}
}