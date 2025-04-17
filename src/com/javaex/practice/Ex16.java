package com.javaex.practice;

public class Ex16 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x * 2; // x == 2 * 2 == 4
		int b = y++ * 2; // y == 1 * 2 == 2
		
		System.out.println("a=" + a); // 4 + 4 == 8, a값 == 4
		System.out.println("a=" + b); // 4 + 2 == 6, b값 == 2
		System.out.println("x=" + x); // 2 + 1 == 3, x값 == 2
		System.out.println("y=" + y); // 1 + 1 == 2, y값 후위연산 +1 == 2
		
	}
}
