package com.javase.day09.practice;

public class Test {
	public static void main(String[] args) {
		Computer com=new Computer();
		Mouse mou=new Mouse();
		mou=null;
		com.open();
		com.useUSB(mou);
		com.close();
	}
}
