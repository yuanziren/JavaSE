package com.javase.day07.thistest;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com1=new Computer("������","����ɫ",20000); 
		Computer com2=new Computer("thinkpad","��ɫ",15000); 
		System.out.println(com1.brand);
		System.out.println(com1.price);
		
		com1.test();
	}
}
