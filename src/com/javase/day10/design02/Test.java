package com.javase.day10.design02;

public class Test {
	public static void main(String[] args) {
		//Single single=new Single();
		System.out.println(Single.newInstance());
		System.out.println(Single.newInstance());
		System.out.println(Single.newInstance());
		
		Single sinle=Single.newInstance();
		sinle.haha();
	}
}
