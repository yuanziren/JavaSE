package com.javase.day10.innerclass04;

//私有的内部类只能在当前的外部类中访问
public class PrivateInnerClass {
	public static void main(String[] args) {
//		Outer03.Inner in = new Outer03().new Inner();
//		in.method();
		Outer03 outer = new Outer03();
		outer.outter();
	}
}

class Outer03{
	private static int a=10;
	private int b=5;
	
	//静态内部类
	private class Inner{
		private static final String name="小白";
		private int age=3;

		void method(){
			System.out.println(name);
			System.out.println(age);
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	//外部类中的成员方法
	public void outter(){
		Inner in=new Inner();
		System.out.println(in.name);
		System.out.println(in.age);
	}
}
