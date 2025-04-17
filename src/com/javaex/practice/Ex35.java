package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final long speed = 300000L;
		System.out.println("빛이 1년 동안 가는 거리는 " + (speed * 31536000) + " km 입니다.");
		
		sc.close();
		
	}
}
