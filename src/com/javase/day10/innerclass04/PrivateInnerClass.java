package com.javase.day10.innerclass04;

//˽�е��ڲ���ֻ���ڵ�ǰ���ⲿ���з���
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
	
	//��̬�ڲ���
	private class Inner{
		private static final String name="С��";
		private int age=3;

		void method(){
			System.out.println(name);
			System.out.println(age);
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	//�ⲿ���еĳ�Ա����
	public void outter(){
		Inner in=new Inner();
		System.out.println(in.name);
		System.out.println(in.age);
	}
}
