package com.javase.day09.interface05;
/*
 * 接口
 * 	使用interface来定义接口  
 * 	接口就是一个特殊的抽象类
 * 
 * 接口的优点:
 * 	1.接口可以多实现,类只能单继承
 * 	2.解耦 ,高内聚低耦合
 * 	3.定义开发规范
 * 	4.提高代码的复用性
 * 
 * jdk1.7及之前接口的组成:只能有公共的静态的常量+公共的抽象方法组成
 * 		常量:	public static final 数据类型  常量名 = 赋值;
 * 		修饰符默认是:public static final 默认的可以省略,可以选择性的省略
 * 		使用: 类名.静态常量名
 * 
 * 		方法:   public abstract 返回值类型 方法名(参数);
 * 		修饰符: public abstract 默认的.可以省略,可以选择性的省略
 * 		使用: 实现类对象.抽象方法名
 * 
 * 特点:
 * 	1.不能实例化 ,因为抽象方法
 * 	2.继承一个类extends ,实现一个接口implements关键字
 * 	3.类只能单继承,类多实现接口
 * 	4.接口的使用:
 * 		具体的实现类:重写所有接口中的所有抽象方法+按需新增
 * 		抽象实现类:按需重写抽象方法+按需新增
 * 	5.一个类只能单继承类,一个类可以多实现接口
 * 	6.接口不能继承类,接口可以多继承接口,接口不能实现接口
 * 
 * jdk1.8新增功能:
 * 				1.默认方法 default,可以定义多个,需要通过实现类对象使用,实现类中可以对默认方法进行重写
 * 				2.静态方法 static,需要通过接口名.静态方法名使用
 * 	
 */
public class InterfaceDemo01 {
	int a;
	 public static void main(String[] args) {
		// MyInterface.a=10;  常量 
		System.out.println(MyInterface.a);
		
		MyImpl my=new MyImpl();
		my.haha();
		my.test();
		
		//MyInterface m=new MyInterface();
		
		//测试接口中默认方法  实现类对象调用
		ImplB im=new ImplB();
		im.hehe();
		im.hehe2();
		//im.staticMethod();
		B.staticMethod();
		
		//接口多态
		B b=new ImplB();
	}
}

//具体实现类
class Concrete extends MyImpl2{

	@Override
	public void haha() {
		System.out.println("hhhhhhhhhh");
	}
	
}

//抽象实现类
abstract class MyImpl2 implements MyInterface,A{

	@Override
	public void test(){
		System.out.println("实现类....");
	};
	
	//void haha();
	
}

//实现类:具体实现类,可以实例化的实现类
class MyImpl implements MyInterface,A{

	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void haha() {
		System.out.println("聊天止于呵呵...,微笑");
	}
	
}

//接口
interface MyInterface{
	//公共的静态的常量
	int a=5;
	
	//抽象方法
	void test();
}

interface A{
	void haha();
}

interface B{
	public default void hehe(){
		System.out.println("我是接口中的默认方法");
	}
	public default void hehe2(){
		System.out.println("我是接口中的默认方法22222");
	}
	//静态方法
	static void staticMethod(){
		System.out.println("我是接口中的静态方法");
	}
}

//实现类
class ImplB implements B{
	@Override
	public void hehe2(){
		System.out.println("我是被重写的那个默认方法");
	}
}


interface C extends B,A{}
