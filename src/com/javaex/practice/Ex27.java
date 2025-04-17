package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		double radius = sc.nextDouble();
		System.out.println("원의 넓이는 " + Math.pow(radius, 2) * 3.14);
		
		sc.close();
	
	}
}
