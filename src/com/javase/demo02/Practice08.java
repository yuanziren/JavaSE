package com.javase.demo02;
/**  
	练习
		
*/
public class Practice08{ 
	//程序的入口
	public static void main(String[] args){
		
		System.out.println("=============练习=================");
		int a=10;
		int b=9;
		System.out.println(a>b & ++b>a);  //
		System.out.println("a="+a+",b="+b);  //
		System.out.println("----");
		System.out.println(a<b | b<a);
		System.out.println("----");//
		System.out.println(!(a>b ^ a>9)); //
		//System.out.println(10>5 & 10/0==0); //
		//System.out.println(10>5 && 10/0==0);
		
		//对下面代码进行注释
		double d=10/3;  
		a=10/3;
		System.out.println("----");
		System.out.println(a==d);    //
		System.out.println(a);    //
		System.out.println(d);    //
		System.out.println("----");
		
		d=10/3.0;  
		a=10/3;
		System.out.println(a==d);    //
		System.out.println(a);    //
		System.out.println(d);    //
		
		//比较2个数的大小求最大的值
		
		//比较三个数的大小,求最大的值
	}
}
