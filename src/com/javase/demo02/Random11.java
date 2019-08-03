package com.javase.demo02;
/**  
	测试java中的Random类
	Random : 产生随机数
		1.导包 java.util.Random
		2.创建类型的变量  Random ran=new Raindom();
		3.变量.功能名字();
			nextInt();  产生int范围内的随机数
			nextInt(整数n) [0,n)随机整数
			
			公式: 
				[0,max] 之间的随机整数
				变量.nextInt(max+1);
				[min,max)
				变量.nextInt(max-min)+min;
				[min,max]
				变量.nextInt(max-min+1)+min;
				
			
			nextDouble(); 产生[0.0,1.0)随机小数
				
		
*/
import java.util.Random;
public class Random11{ 
	//程序的入口
	public static void main(String[] args){
		//1.导包
		//2.创建类型的变量  
		Random ran=new Random();
		//3.变量.功能名字();
		System.out.println(ran.nextInt());
		//[0,5)
		System.out.println(ran.nextInt(5));
		//[0,5]
		System.out.println(ran.nextInt(6));
		//[2,5]     [0,5]+3   [3,8]
		System.out.println(ran.nextInt(3)+2);
		
		System.out.println(ran.nextDouble());
	}
}
