package com.javaex.practice;

public class Ex24 {
	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println(5 / 9 * (f-32.0)); // 5 / 9 == 0, 80.0 - 32.0 == 48.0 * 0 == 0.0
		System.out.println(5.0 / 9.0 * (f-32.0)); // 5.0 / 9.0 == 0.55.., 80.0 - 32.0 == 48.0 * 0.55 == 26.66..
		
	}
}
