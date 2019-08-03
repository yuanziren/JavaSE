package com.javase.day10.innerclass04;
/*
 * 内部类:类中的类
 * 	
 * 	成员内部类
 * 	静态内部类
 *  局部内部类
 *  匿名内部类 : ****  Lambda
 *  
 *  成员内部类:
 *  		内部类定义在外部类的成员位置,当外部类的成员也是一个具体的事物,可以把它定义为一个内部类
 *  内部类就有类的特点:继承,实现...
 *  成员位置的内部类:具体成员的特点,可以使用成员修饰符
 *  
 *  成员内部类中可以使用外部类中的所有成员,包括私有的
 *  成员内部类中不可以定义静态的内容,除了静态的常量
 *  在外部类中如何使用成员内部类中的内容,通过内部类的对象使用
 */
public class Outer01 {
	private int a=5;
	
	//成员内部类
	class Inner extends HaHa implements A{
		static final int b=12;
		int c=15;
		int a=9;
		
		
		public void test(){
//			System.out.println("哈哈"+a);
			int a=15;
			System.out.println(a); //15   就近原则  局部变量a=15
			System.out.println(this.a); //  内部类中的成员a=9
			System.out.println(Outer01.this.a); //  外部类中的成员a=5
		}
		//成员内部类中不可以定义静态的内容，除了静态常量。静态内部类中可以定义静态的内容
		/*static void content(){
			
		}*/
	}
	
	public void outter(){
		System.out.println("我是外部类中的成员方法");
		Inner in=new Inner();
		System.out.println(in.c); //15
		System.out.println(Inner.b); //12
		in.test();
	}
}

class HaHa{}
interface A{}
