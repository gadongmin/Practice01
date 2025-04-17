package com.javaex.practice;

public class Ex25 {
	public static void main(String[] args) {
		
		int a = 13;
		
		
		System.out.println((a>13) && (a>=13)); // f, (13>13) && (13>=13)
		
		System.out.println((a>13) || (a>=13)); // t, (13>13) || (13>=13)
		
		System.out.println((a/3 == 4) && (a%3 == 2)); // f, (13/3 == 4) && (13%3 == 1)
		
		System.out.println((a/3 == 4) || (a%3 == 2));  // t, (13/3 == 4) || (13%3 == 1)
		
		System.out.println((a/3 == 4) && (a%3 == 2) || (a/3 == 4) );  // t, (13/3 == 4) && (13%3 == 1) || (13/3 == 4) 
	
	}
}
