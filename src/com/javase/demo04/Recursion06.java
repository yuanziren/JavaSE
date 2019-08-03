package com.javase.demo04;
/**  	
	测试方法递归
		递归:自己调用自己
		
		递归头:停止自己调用自己条件
		递归体:自己调用自己
		
		临界条件:递归头
		递归前进段:没有满足临界条件时,自己调用自己
		递归后退段:满足临界条件以后,把结果返回给上一层
*/
public class Recursion06{ 
	//程序的入口
	public static void main(String[] args){
		//int result=recursion(5);
		//System.out.println(result);
		
		print(12);
	}
	
	//求 5的阶乘  求某个数的阶乘   5*4*3*2*1 = 5* recursion(4)
	//功能:求买某个数的阶乘  参数:int n   返回值:需要返回值  int
	public static int recursion(int n){
		//临界条件
		if(n==1){
			return 1;
		}
		//自己调用自己
		return n* recursion(n-1);
	}
	
	//求:九九乘法表   求某个的乘法表
	//功能:求某个的乘法表    参数 :要,几几就是参数 int i   返回值:不需要
	//递归:临界条件:i=1   1*1=1;
	public static void print(int i){
		//临界条件
		if(i==1){
			System.out.println("1*1=1");
			return;
		}
		print(i-1);
		//打印当前行代码
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+j*i+"\t");
		}
		System.out.println();  //这一行打印完成之后换行
	}
	
}
