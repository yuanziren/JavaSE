package com.javase.day11.str03;

public class StringTest {

	public static void main(String[] args) {
		 String s0 = "abc";
		 String s = "abc";
		 String s1 = new String("abc");
		 String s2 = new String("abc");
		 System.out.println(s1);//abc
		 System.out.println(s2);//abc
		 System.out.println(s1==s2);//false
		 System.out.println(s0==s1);//false
		 System.out.println(s0==s);//false
		 System.out.println(s1.equals(s2));//true
		 System.out.println(s1.equals(s0));//true
		 
	}
}
