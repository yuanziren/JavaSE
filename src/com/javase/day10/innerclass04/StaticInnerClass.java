package com.javase.day10.innerclass04;
/*
 * 静态内部类:
 * 	1.只有静态内部类中可以定义静态内容,除了静态的常量意外
 * 	2.在静态的内部类中的方法里面,可以直接使用外部类中的静态内容,通过外部类的对象使用外部类中的成员
 */
public class StaticInnerClass {
	public static void main(String[] args) {
		//其他类中创建静态内部类的对象
		Outer02.Inner in=new Outer02.Inner();
		in.staticMethod();
		in.method();
		System.out.println(in.name);
		System.out.println(in.getAge());
	}
}

class Outer02{
	private static int a=10;
	private int b=5;
	
	//静态内部类
	static class Inner{
		static String name="小白";
		
		static final int con = 1;
		
		private int age=3;
		
		public int getAge(){
			return age;
		}
		
		static void staticMethod(){
			System.out.println(con);
			System.out.println(name);
			Inner i=new Inner();
			System.out.println(i.age);
			
			System.out.println(a);
			Outer02 out=new Outer02();
			System.out.println(out.b);
			out.outermethod();
			Outer02.outermethod();
		}
		
		void method(){
			System.out.println(name);
			System.out.println(age);
			
			System.out.println(a);
			Outer02 out=new Outer02();
			System.out.println(out.b);

		}
	}
	
	static void outermethod(){
		System.err.println("静态内部类可以使用外部类的静态方法，使用时通过外部类的对象或者类名访问");
	}
	
	//外部类中的成员方法
	public int outter(){
		System.out.println("我是外部类中的成员方法");
		Inner in=new Inner();
		System.out.println(in.name);
		System.out.println(Inner.name);
		System.out.println(in.age);
		return in.age;
	}
}
