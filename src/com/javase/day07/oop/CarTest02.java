package com.javase.day07.oop;
/*
 * 测试小汽车类
 * 
 * 天使类  angel  天使不止有一个,每一个天使都不尽相同,自己画内存分析流程图
 */
public class CarTest02 {
	public static void main(String[] args) {  //main  ->alt+/ 快捷键
		//1.创建对象  car对象的一个引用  new创建对象
		Car01 car=new Car01();  
		
		//2.给属性赋值
		car.color="宝蓝色";
		car.brand="玛莎";
		car.num=4;
		
		//3.使用功能
		car.run();
		
	}
}
