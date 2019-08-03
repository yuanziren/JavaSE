package com.javase.day07.oop;
/*
 * 自定义小汽车类
 * 	属性: 颜色  品牌  轮胎个数
 * 	功能: 跑
 */
public class Car01 {
	//颜色
	String color;
	//品牌
	String brand;
	//轮胎个数
	int num;
	
	//跑
	public void run(){
		System.out.println("一辆"+color+"的"+num+"个轱辘的"+brand+"在跑...");  //syso->alt+/ 快捷键
	}
}

