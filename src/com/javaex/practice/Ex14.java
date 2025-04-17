package com.javaex.practice;

public class Ex14 {
	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println(a); // 5
		System.out.println(++a); // 6, 전위 증가연산 값
		System.out.println(a); // 6
		System.out.println(a++); // 6 후위 증가연산 값
		System.out.println(a); // 7
		System.out.println(--a); // 6 전위 증가연산 값
		System.out.println(a); // 6
		System.out.println(a--); // 6 후위 증가연산 값
		System.out.println(a); // 5
	}
}
