package com.javase.day10.design02;
/*
 * 饿汉式
 *  1.构造器私有化
 *  2.提供一个私有的,静态的该类的引用
 *  3.静态的公共的访问方式
 */
public class SingleTon {
	private static SingleTon singleTon=new SingleTon();
	
	private SingleTon(){}
	
	public static SingleTon newInstance(){
		return singleTon;
	}
}
