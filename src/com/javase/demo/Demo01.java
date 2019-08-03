package com.javase.demo;

//java是以类为单位的,编译运行的都是类
public class Demo01{
	//一个没有主方法的类编译不会报错,但是解释执行要找主方法
	public static void main(String[] args) {
		System.out.println("我要被执行了。。。其他类不运行");
	}
}
//一个java文件中可以存在多个类,每个类的类名不能相同,被public修饰的类只能有一个,这个类名要与文件名相同
//每个类都会被编译成一个class文件,所以解释执行的时候不需要加后缀名
class Demo{
	//主方法是程序的入口 逐行执行主方法中的代码
	public static void main(String[] args){
		
		System.out.println("殷唯");
		System.out.println("好");
		System.out.println("棒棒!!!!");
	}
	//一个类中只能有一个主方法,可以有多个其他方法
	public static void main1(String[] args){
		System.out.println("鸭");
	}
	
}

class Test{
	public static void main(String[] args){
		System.out.println("因为");
	}
}