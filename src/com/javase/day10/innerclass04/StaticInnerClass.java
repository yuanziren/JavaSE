package com.javase.day10.innerclass04;
/*
 * ��̬�ڲ���:
 * 	1.ֻ�о�̬�ڲ����п��Զ��徲̬����,���˾�̬�ĳ�������
 * 	2.�ھ�̬���ڲ����еķ�������,����ֱ��ʹ���ⲿ���еľ�̬����,ͨ���ⲿ��Ķ���ʹ���ⲿ���еĳ�Ա
 */
public class StaticInnerClass {
	public static void main(String[] args) {
		//�������д�����̬�ڲ���Ķ���
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
	
	//��̬�ڲ���
	static class Inner{
		static String name="С��";
		
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
		System.err.println("��̬�ڲ������ʹ���ⲿ��ľ�̬������ʹ��ʱͨ���ⲿ��Ķ��������������");
	}
	
	//�ⲿ���еĳ�Ա����
	public int outter(){
		System.out.println("�����ⲿ���еĳ�Ա����");
		Inner in=new Inner();
		System.out.println(in.name);
		System.out.println(Inner.name);
		System.out.println(in.age);
		return in.age;
	}
}
