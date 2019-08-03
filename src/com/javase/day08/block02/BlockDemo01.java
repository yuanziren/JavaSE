package com.javase.day08.block02;
/*
 * 块  block {}
 * 	1.{}定义在方法中,局部代码块|普通语句块 			执行时机:调用方法
 *  2.{}定义在类中方法外,构造块					执行时机:创建对象
 *  3.static{}定义在类中方法外,静态块				执行时机:类加载的时候
 *  
 *  注意:构造块先于构造器执行,如果存在多个构造块,从上到下一次执行
 *  	静态块在第一次类加载的时候只初始化一次,先于main方法执行,如果存在多个静态块,从上到下一次执行
 *  
 *  执行顺序:静态块  --- main---构造块---构造器
 */
public class BlockDemo01 {
	static int i=5;
	
	public static void main(String[] args) {
		System.out.println("我是主方法");
		//int i=7;
		//局部代码块
		{
			i=10;	
			System.out.println(i);
		}
		
		System.out.println(i);  //10	
		
		BlockDemo01 bd=new BlockDemo01();
		bd.test();
	}
	
	//快速复制当前行到下一行"ctrl+alt+方向下键
	static{
		System.out.println("我是静态块1");
	}
	static{
		System.out.println("我是静态块2");
	}
	
	//空构造
	public BlockDemo01() {
		System.out.println("空构造");
	}
	
	//构造块
	{
		int a=5;
		System.out.println("我是构造块1");
	}
	
	{
		System.out.println("我是构造块2");
	}
	
	
	
	void test(){
		System.out.println(i);
	}
}
