package com.javase.day08.block02;
/*
 * 静态块--main---构造块---构造器
 */
public class BlockTest02 {
	public static int a =0;
	{
		a = 10;
		System.out.println("3、非静态代码块执行a=" + a); //10
	}	
	static {
		a = 6;
		System.out.println("1、静态代码块执行a=" + a); //6
	}
	public BlockTest02() { 
		this(a);  //6
		System.out.println("6、"+a);  //10
		System.out.println("7、无参构造方法执行a=" + a); //10
	}
	public BlockTest02(int n) {  //n=6
		/*{
			a = 10;
			System.out.println("3、非静态代码块执行a=" + a); //10
		}*/	
		System.out.println("4、"+n); // 6  
		System.out.println("5、"+a);//10 
	}	
	public static void main(String[] args) {
		System.out.println("2  main"); //main
		BlockTest02 tsc = new BlockTest02();	
	}
}
