package com.cg;

import java.time.*;

public class InstantClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Instant i1=Instant.now();
			System.out.println("Instant.now() => "+i1);
			System.out.println("EPOCH => "+Instant.EPOCH);
			System.out.println(i1.EPOCH);
	}

}
