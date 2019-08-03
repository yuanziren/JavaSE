package com.javase.day10.work01;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(sc.next());
		sc.nextLine(); //先去把前面功能遗留的enter消掉
		System.out.println(sc.nextLine());
	}
	
}

