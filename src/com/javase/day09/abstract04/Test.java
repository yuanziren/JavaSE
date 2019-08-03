package com.javase.day09.abstract04;

public class Test {
	public static void main(String[] args) {
		//创建抽象类对象
		//Develop develop=new Develop();
		
		//创建子类对象
		JAVAEE javaee=new JAVAEE();
		javaee.work();
		javaee.closeEyesCode();
		javaee.test();
		
		Android an=new Android();
		an.haha();
		an.work();
		an.test();
	}
}
