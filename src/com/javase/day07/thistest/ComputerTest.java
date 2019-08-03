package com.javase.day07.thistest;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com1=new Computer("外星人","土黄色",20000); 
		Computer com2=new Computer("thinkpad","黑色",15000); 
		System.out.println(com1.brand);
		System.out.println(com1.price);
		
		com1.test();
	}
}
