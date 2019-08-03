package com.javase.demo02;
/**  
	测试java中的条件运算符
		比较表达式?值1:值2;
		
		1.比较表达式  值为boolean类型的表达式
		2.如果结果为true,取值1
		3.如果结果为false,去取值2
		
*/
public class Operator07{ 
	//程序的入口
	public static void main(String[] args){
		int a=11;
		System.out.println(a>0?"大于0":"不大于0");
		
		//判断这个值是否为偶数  能被2整除  %2==0
		String str=a%2==0?"偶数":"奇数";
		System.out.println(str);
	}
}
