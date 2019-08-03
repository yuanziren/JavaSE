package com.javase.demo03;
/**  
	 测试java中的循环
		循环:让一些代码重复执行
		
		for
		while
		do..while
		
		for(条件初始化;条件判断;条件变化){
			循环体语句;
		}
		条件初始化:声明一个变量,并第一次赋值  这个声明的变量就是后面判断的条件
		条件判断:对刚声明的变量判断是否满足条件,决定是否可以执行循环体语句
		条件变化:变量自身值的改变,让变量不满足条件判断,达到让循环停止的作用
		
		执行流程:
			1.执行条件初始化
			2.条件判断,得到boolean的结果,值为boolean类型的表达式
			3.如果结果为true,就执行循环体语句,如果结果为false,就结束循环
			4.条件变化
			5.条件判断....
			从第二次循环开始,都不会再去执行第一步条件初始化
	
		条件不仅可以决定执行次数,也可以在循环体中使用,随着每次改变而更新
		条件的作用域只在循环中可以使用
*/
public class Demo03{ 
	//程序的入口
	public static void main(String[] args){
		//打印10遍
		for(int i=1;i<=10;i++){
			System.out.println("安红,我想你想的睡不着觉~~~"+i);
		}
		
		//打印5~10之间的数字
		for(int i=5;i<11;i++){
			System.out.println(i);
		}
		
		//计算1+2+3+4
		int sum=0; //存储和
		for(int i=1;i<=4;i+=1)
			sum=sum+i; //循环语句只有一句才能省略{}
		
			System.out.println("---------------");
			
		
		System.out.println(sum);
		//System.out.println(i);  
		
	}
}
