package com.javase.day08.javabean;
/*
 * 解决安全隐患问题:介绍一个关键字  private  私有的
 * 	private 成员修饰符 ,只能修饰成员不能修饰局部
 *  被private修饰的内容只能在本类中使用
 *  对外提供公共的访问方式  -> 设置器setter  访问器getter
 *  公共的方法定义设置器与访问器
 *  
 *  私有的属性并提供公共的访问方式是封装的一种体现
 *  封装:封装内部具体的实现细节,对外提供公共的访问方式
 *  
 *  好处：
	A:隐藏实现细节，提供公共的访问方式
	B:提高代码的复用性
	C:提高代码的安全性

 *  
 *  面向对象的三大特性之一:  封装  继承   多态
 *  
 *  私有是封装,封装不是私有  
 *  方法,类..都是封装的体现
 *  
 *  以后的自定义类,Person.. 所有的属性全部私有,并提供公共的访问方式
 *  
 *  JavaBean 一系列类的统称,符合javabean编写要求的模板类
 *  javaBean编码规则：
	(1) javaBean必须声明为public class，这样才能够被外部所访问；
	(2) 一个JavaBean中至少存在一个无参构造方法
	(3)类中所有的属性都必须封装，即：使用private声明；
	(4)为封装的私有属性提供公共的setter、getter方法；

 */
public class Person {
	String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//设置器 为私有的属性赋值
	//返回值 :没有返回值        参数:需要参数
	public void setAge(int age){
		if(age<=0){
			this.age=1;
			return;
		}
		this.age=age;
	}

	//访问器 获取age的值
	//返回值:需要返回值       参数:不需要
	public int getAge(){
		return this.age;
	}
	
	//info
	public void info(){
		System.out.println(name+"---->"+age);
	}
}
