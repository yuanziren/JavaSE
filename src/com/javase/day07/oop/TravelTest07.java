package com.javase.day07.oop;
/*
 * 描述行为的时候,
 * 	先分析有几个事物   没个都是自定义类    没个类怎么定义    属性|功能     测试
 */
public class TravelTest07 {
	public static void main(String[] args) {
		//先创建国家对象
		Country05 country=new Country05();
		country.name="迪拜";
		country.hotel="帆船酒店";
		
		//创建一个秘书对象
		Secretary06 sec=new Secretary06();
		sec.name="裴老师";
		sec.gender="男";
		System.out.println(sec.gender);  //男
		
		sec.strategy(country.name);
		sec.book(country);
		
		System.out.println(sec.gender);  //女
	}
}
