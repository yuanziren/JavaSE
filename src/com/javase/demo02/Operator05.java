package com.javase.demo02;
/**  
	测试java中的关系运算符|比较运算符
		>  <  >=  <=
		只能用来比较  byte short int long folat double char
	
		==  !=
		可以用来比较基本数据类型可以用来比较引用数据类型
		
		关系运算符最终得到的结果为boolean类型 true/false
		
*/
public class Operator05{ 
	//程序的入口
	public static void main(String[] args){
		int a=12;
		int b=15;
		System.out.println(a+3>b);  //false
		System.out.println(a+3>b);  //false
		System.out.println(a+3==b++);  //true
		System.out.println(b);
		System.out.println("因为"!="因为");  //false
		
	}
}
