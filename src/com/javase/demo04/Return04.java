package com.javase.demo04;
/**  	
	测试java中的return
		return使用在有返回值类型的方法中:--必须存在return
										带出返回值
										结束方法
			  使用在没有返回值类型的方法中:结束方法 --可以存在可以不存在
		return后面的代码不会执行
			不可达语句:永远无法访问的语句
		一定会遇到不可达语句的几种情况:
									1.return后面
									2.死循环后面
									3.一定会执行的break后面
									4.一定会执行的continue后面
									5.while(false)中的语句
		在一个方法中连续出现的return只能有一个
		
	兼容类型
		形参的数据类型>=实参的数据类型
		接受类型>=返回值类型>=return后返回数据的类型
			
*/
public class Return04{ 
	//程序的入口
	public static void main(String[] args){
		//long a=test((byte)15);
		/*
		for(;;){
			
		}
		
		
		while(false){
			System.out.println(5555);
		}
		*/
		
		int area=getArea(5,6);
	}
	
	public static int getArea(int w,int h){
		return w*h;
	}
	
	public static int test(int a){
		if(a==5){
			return -1;
			//return -2;
			//System.out.println(1111);  //无法访问的语句
		}
		
		return (byte)a;
	}
	
	
}
