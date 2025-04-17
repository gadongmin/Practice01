package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");		
		int fh = sc.nextInt();
		
		System.out.print("100원 개수: ");		
		int oh = sc.nextInt();
		
		System.out.print("50원 개수: ");		
		int ft = sc.nextInt();
		
		System.out.print("10원 개수: ");		
		int ot = sc.nextInt();
		
		System.out.println("동전의 총합은 " + (ft*500 + oh*100 + ft*50 + ot*10) + " 원 입니다.");
		
		
		sc.close();
	}
}
