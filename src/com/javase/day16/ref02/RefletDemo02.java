package com.javase.day16.ref02;

import java.io.IOException;
import java.util.Properties;

/*
 * Class Class 类的实例表示正在运行的 Java 应用程序中的类和接口。
 * 在创建类的对象之前,这个类就存在一个独一份的Class对象,我们在创建对象的时候其实是拿到一个Class对象的复制体|镜像
 * 一个类只有一个Class对象
 * Class对象中存着这个类的所有信息
 * 只要能够拿到一个类型的Class对象,就可以做一切事情:创建对象,调用方法..
 * 
 * 反射的源头:Class对象
 * 	1.类名.class
 *  2.对象.getClass()
 *  3.Class.forName("包名+类名");  包名+类名=权限定名
 */
public class RefletDemo02{
	public static void main(String[] args) throws ClassNotFoundException {
		//获取Class对象的方式:
		Class cls1=String.class;
		Class cls2="一拳一个小朋友".getClass();
		System.out.println(cls1==cls2);  //true
		System.out.println(cls1.toString());  //class java.lang.String
		
		Class cls3=Class.forName("java.lang.String");
		System.out.println(cls2==cls3);  //true
		
		//根据一个类的Class对象,获取这个类的父类的Class对象
		Class superCls1=cls1.getSuperclass();
		Class objCls=Object.class;
		System.out.println(superCls1==objCls);  //true

		//获取基本数据类型的Class对象
		Class basic01=int.class;
		System.out.println(basic01);
		//根据保证类型的TYPE属性获取基本数据类型的Class对象
		Class basic02=Integer.TYPE;
		System.out.println(basic02);
		System.out.println(basic02==basic01);
		//Integer的Class对象,包装类型的Class对象
		System.out.println(Integer.class);
		System.out.println(Class.forName("java.lang.Integer"));

	}
}

