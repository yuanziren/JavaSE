package com.javase.day08.supertest;
/*
 * Super : ָ���������
 * this : ָ����ǰ����
 * 
 * 	���ø��๹����
 * 		���û����ʾʹ��super(����)���ø��๹������ʱ��,��Ĭ�ϵ��ø���չ���
 * 		�����Ҫ���ø����е�����������,��ʹ��super(����)��ʾ����
 * 
 * 	�����Ӹ�����ͬ����Ա
 * 		�������븸���д���ͬ����Ա��ʱ��,ʹ��this����(�������)��ǰ�����,ʹ��super���������,Ĭ��this.
 * 		���������ͬ���ֲ�����,Ĭ��ʹ�þͽ�ԭ���Ҿֲ�����,this���ڶ���|�������,superָ���������
 *  �ȸ��������
 *  super����ʹ����static���εķ�����,��Ϊ��̬���ݿ���û�ж���ʹ��,��super��this��ʹ��ǰ������ڶ���
 */
public class SuperDemo {
	public static void main(String[] args) {
		Zi zi=new Zi();
		zi.test();
	}
}

class Fu{
	int a=5;
	String name;
	int age;
	int b=10;
	
	//alt+/  �չ���
	public Fu() {
		System.out.println("���Ǹ���չ���");
	}
	public Fu(int a) {
		this.a=a;
		System.out.println("���Ǹ�����ι��칹��");
	}
	
	public Fu(int a, String name, int age) {
		this.a = a;
		this.name = name;
		this.age = age;
	}

	void demo(){
		System.out.println("���Ǹ����е�demo'");
	}
	
}

class Zi extends Fu{
	int b=5;
	public Zi() {
		//���ø�������������
		//super();
		System.out.println("��������չ���");
	}
	
	public Zi(int a,String name, int age) {
		super(a,name,age);
	}

	void test(){
		int b=1;
		//����ʹ��super�д�ž��Ǹ������ĵ�ַ,���Ե��ø����еĳ�Ա�����ͳ�Ա����
		System.out.println(b);   //�ֲ�����  1
		//System.out.println(this.b);  //�����г�Ա  5
		System.out.println(super.b);  //�����еĳ�Աb  10
		
		super.demo();
	}
	
	void demo(){
		System.out.println("���������е�demo'");
	}
}
