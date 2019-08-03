package com.javase.demo04;
/**  	
	测试方法的重载  Overload   重写
		在同一个类中,多个方法有相同的方法名字,不同的参数列表(方法签名不同 :方法签名是方法的唯一标识 方法签名=方法名+参数列表)
		
	方法重载的要求:
		同一类中
		多个方法相同的方法名
		不同的参数列表
			参数数据类型不同
			参数的个数不同
			参数的顺序不同(不同数据类型的顺序不同)
			
	方法的重载和参数的名字无关
	方法的重载和有没有返回值类型无关
	方法的重载和返回值类型无关
	方法的重载和修饰符无关
	
	方法重载只和方法名还有参数列表相关
	
	重载方法的调用只和方法调用时候的实参决定
	
	方法是一个类中封装的一种体现
	方法的重载就是一个类中多态的一种体现
*/
public class Method05{ 
	//程序的入口
	public static void main(String[] args){
		//调用重载方法
		getSum(5,7.7);
	}
	
	
	//计算参数的和
	public static String getSum(int a,int b){
		System.out.println("求两个int的参数和");
		return "";
	}
//	private static int getSum(int a,int b){
//		System.out.println("求两个int的参数和");
//		return -1;
//	}
	
	public static void getSum(int a,int b,int c){
		System.out.println("求三个int的参数和");
	}
	public static void getSum(double a,double b){
		System.out.println("求两个double的参数和");
	}
	public static void getSum(int a,double b){
		System.out.println("求个int个double的参数和");  
	}
	public static void getSum(double b,int a){
		System.out.println("求个double个int的参数和");
	}
	
	//打印九九乘法表的时候  99     指定具体几行的乘法表  print   
}
