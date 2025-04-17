package com.javaex.practice;

public class Ex21 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ % 2; // 10 % 2 == 0
		
		System.out.println(i); // 10 + 1(후위 연산) == 11
		System.out.println(n); // 0
		
	}
}
