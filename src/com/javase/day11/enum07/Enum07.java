package com.javase.day11.enum07;

import java.util.Arrays;

/*
 * 枚举类  enum :列举出所有可能
 * 
 * 1.所有的枚举类都隐式继承了java.lang.Enum
 * 2.枚举类也是类,枚举类中的所有字段,默认是当前枚举类型的一个实例, public static final
 */
public class Enum07 {
	public static void main(String[] args) {
		//获取枚举类的实例 
		WeekDay day=WeekDay.Tues;
		System.out.println(day.name());
		//int ordinal()     返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。 
		System.out.println(day.ordinal());
		WeekDay[] week=day.values();
		System.out.println(Arrays.toString(week));
		
		System.out.println(day.getName());
		day.print();
		
		//switch 支持了枚举类型的数据
		switch(day){
		case Mon:
			System.out.println("我是星期一,哈哈哈");
			break;
		case Tues:
			System.out.println("我是星期二,哈哈哈");
			break;
		}
	}
}

//枚举类
enum WeekDay{
	Mon("星期一"),  //public static final WeekDay Mon=new WeekDay("星期一");
	Tues("星期二"),
	Wed("星期三"),
	Sun("星期天");
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//私有构造器
	private WeekDay(String name){
		this.name=name;
	}
	
	public void print(){
		System.out.println("今天是"+name);
	}
}