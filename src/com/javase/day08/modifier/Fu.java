package com.javase.day08.modifier;
//父类  测试权限修饰符
public class Fu{
	private int p=5;
	int d=10;
	protected int pro=15;
	public int pub=20;
	
	public void test(){
		System.out.println(p+"--->"+d+"--->"+pro+"--->"+pub);
	}
	
	public static void test2(){
		System.out.println("我是父类的静态方法。。。");
	}
	
	public Fu() {
		
	}
}