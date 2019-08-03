package com.javase.demo03;
/**  
	 测试java中的do..while循环
	 条件初始化;
	 do{
		 语句体;
		 条件变化;
	 }while(条件判断);
	 
	 do..while无论是否满足条件都至少执行一遍
	 
	 for  区间判断
	 while 条件循环
	 do..while 条件循环,至少执行一次
*/
public class Demo06{ 
	//程序的入口
	public static void main(String[] args){
		//1~100之间的和
		int i=1;
		int sum=0;
		while(i<=100){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
		
		int j=1;
		sum=0;
		do{
			sum+=j;
			j++;
		}while(j<=100);
		System.out.println(sum);
		System.out.println(j);
		
		//骗一下编译器
		boolean flag=false;
		while(flag){
			System.out.println("----lalalala--------");
		}
		
		do{
			System.out.println("----lalalala--------");
		}while(false);
	}
}
