package com.javase.day10.innerclass04;

public class Test {
	public static void main(String[] args) {
		//测试在其他类中使用成员内部类中的内容  内部类的对象要根据外部类的对象使用
		Outer01 outer=new Outer01(); //外部类的对象
		outer.outter();
		//Outer01.Inner i=outer.new Inner();
		
		Outer01.Inner in=new Outer01().new Inner();
		in.test();
		
	}
}
