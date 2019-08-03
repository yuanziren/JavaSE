package com.javase.day08.import04;
/*
 * 注意:不要定义与jdk相同的包，相同的类，  否则会引起很多你觉得莫名其妙的问题
 * 
 * 不需要使用import的类有
		1、	语言包 （java.lang）下的类
		2、	同包下的类

	静态导入:可以导入静态的内容 
	
	模糊匹配:不糊降低运行效率,会降低编译效率
	
	使用其他外部类的引入方式:
					1.import导包
					2.写全名 java.util.Random ran1=new java.util.Random();  只在当前行有效
	
 */
import static java.lang.Math.PI;
import static java.lang.Math.round;
import static java.lang.System.out;

//import java.util.*;
public class ImportDemo {
	public static void main(String[] args) {
		out.println(PI);
		out.println(round(1.2));
		
		//Scanner sc=new Scanner(System.in);
		
		java.util.Random ran=new java.util.Random();
		
		java.util.Random ran1=new java.util.Random();
	}
}
