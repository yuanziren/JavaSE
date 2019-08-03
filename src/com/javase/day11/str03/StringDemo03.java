package com.javase.day11.str03;
/*
 * String 不可变长字符串  构造器   方法
 * StringBuilder :可变长字符串,线程不安全的,效率较高
 * StringBuffer:可变长字符串,线程安全的,效率较低
 * 	默认初始容量为16的字符数组
 * StringBuilder>StringBuffer>String 
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String str="abc";
	//	System.out.println(str.hashCode());
	//	str.replace('a', 'A');
		
		//StringBuilder() 构造一个其中不带字符的字符串生成器，初始容量为 16 个字符。
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//StringBuilder(int capacity)	构造一个字符串生成器没有指定的字符和一个初始容量 capacity论点。
		sb=new StringBuilder(20);
		System.out.println(sb.capacity());
		
		//StringBuilder(String str) 构造一个字符串生成器初始化为指定的字符串的内容。 
		sb=new StringBuilder("abc");  
		System.out.println(sb.capacity());  //19  16+str.length()
		
		//追加  append(double d) 附加 double参数的字符串表示这个序列。 
		System.out.println(sb.length());
		System.out.println(sb.append(false));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//删除   StringBuilder delete(int start, int end)    int end结束索引取不到
		System.out.println(sb.delete(2,4)); 
		System.out.println(sb);
		
		//指定位置插入 StringBuilder insert(int offset, String str)  
		sb.insert(2, "ffff");
		System.out.println(sb);
		
		//反转  StringBuilder reverse()
		System.out.println(sb.reverse());
		
		String s=new String(sb);
		System.out.println(s);
		
		StringBuffer sb2=new StringBuffer("哈哈");
		sb2.reverse();
		
		for(int i=0;i<=100;i++){
			s+="asdf";
		}
		
		//
		String string1="cde"; //1个 "cde"
		String string2=new String("cde"); //1个 new
		String string3=new String("fff");  //2个 new  "fff"
		String string4="a"+"b"+"c"+"d"; //String string4="abcd";  1个
		
		String str1="vv";  //1个
		String str2="hh";  //1个
		String str3=str1+str2;  //2个  new StringBuilder(str1)  .append(str2)   .toString"vvhh"
		
		
	}
}
