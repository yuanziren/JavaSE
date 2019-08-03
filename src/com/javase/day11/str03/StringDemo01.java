package com.javase.day11.str03;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com.javase.day08.javabean.Person;

/**
 * 常用类:常常用到的类
 *	  类是干嘛的 
 *		1.构造器
 *		2.成员方法
 *		3.静态方法
 *	 String:字符串  ""字面常量值都作为String类型的实例对象
 *		底层是字符数组 char[] 
 *
 *	String 不可变长字符串序列
 *	StringBuffer :可变长字符串序列
 *	StringBuilder :可变长字符串序列
 */
public class StringDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="abc"; //"abc"是一个String对象
		
		//String()  初始化一个新创建的 String 对象，使其表示一个空字符序列。
		String str1=new String();  
		System.out.println("----------");
		System.out.println(str1);
		System.out.println("----------");
		
		
		//String(String original)  初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
		String str2=new String("abc");
		String str3=new String("abc");
		String str4="abc";
		System.out.println(str2);//abc
		System.out.println(str3);
		System.out.println("----------");
		System.out.println(str2==str);  //false
		System.out.println("----------");
		System.out.println(str2.equals(str));  //true
		System.out.println("----------");
		System.out.println(str2==str3);  //flase
		System.out.println("----------");
		System.out.println(str==str4);  //true
		System.out.println("----------");
		
		//String(char[] value)   分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
		String str5=new String(new char[]{'a','b','c'});
		System.out.println(str5);  //abc
		
		//String(char[] value, int offset, int count)   分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
		String str6=new String(new char[]{'你','好','中','国'},2,2);
		System.out.println(str6);  //中国
		
		//String(byte[] bytes)       通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
		byte[] arr="因为".getBytes();
		byte[] arr2="因为".getBytes("gbk");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		String str7=new String(new byte[]{67,68,69});
		//String(byte[] bytes, String charsetName) 通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。
		String str8=new String(arr,"gbk");
		System.out.println(str7);
		System.out.println(str8);
		
		
		//String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
		String str9=new String(arr,3,3);
		System.out.println(str9);
		
		/*
		 * String(StringBuffer buffer) 
		          分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列。 
		   String(StringBuilder builder) 
		          分配一个新的字符串，它包含字符串生成器参数中当前包含的字符序列。 

		 */
	}
}
