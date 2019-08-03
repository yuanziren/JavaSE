package com.javase.demo03;
/**  
	 while循环 条件循环
	 
	 完整结构:
	 
	 条件初始化;
	 while(条件判断){
		 循环体语句;
		 条件变化;
	 }
*/
public class Demo05{ 
	//程序的入口
	public static void main(String[] args){
		//打印1~100之间的数
		int i=1;  //条件初始化;
		while(i<=100){
			System.out.println(i);
			i++; //条件变化
		}
		
		System.out.println(i);
		
		int j=1;
		int sum=0;
		while(j<5){
			sum+=j;
			j++;
		}
		//ctrl+c 强制终止程序的执行在命令行中
		System.out.println(sum);
		
		//死循环
		/*
		while(true){
			System.out.println(1111111);
		}
		*/
		
		for(int int1=1;i>0;){
			System.out.println(1111111);
		}
		System.out.println("我是死循环后的代码");
		
	}
}
