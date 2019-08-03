package com.javase.day11.data05;
/*
 * 常见面试题
 */
public class DataDemo06 extends Object{
	public static void main(String[] args) {
		int i1=127;
		int i2=127;
		Integer in1=127; //自动装箱  Integer.valueOf()
		Integer in2=127;
		
		Integer in3=128;
		Integer in4=128;
		
		Integer integer1=new Integer(127);
		Integer integer2=new Integer(127);
		System.out.println(i1==i2);  //true
		System.out.println(in1==in2);  //true
		System.out.println(integer1==integer2);  //false
		System.out.println(in2==integer2);  //false
		System.out.println(i2==integer2);  //true  自动拆箱   integer2.intValue()  == i2
		System.out.println(i2==in2);  //true
		System.out.println(in3==in4);  //false
		
		//整数都是有缓冲区的-128~127  
		//Byte l1=Byte.valueOf(121);
		
	}
}
