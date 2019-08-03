package com.javase.day09.interface05;
/*
 * �ӿ�
 * 	ʹ��interface������ӿ�  
 * 	�ӿھ���һ������ĳ�����
 * 
 * �ӿڵ��ŵ�:
 * 	1.�ӿڿ��Զ�ʵ��,��ֻ�ܵ��̳�
 * 	2.���� ,���ھ۵����
 * 	3.���忪���淶
 * 	4.��ߴ���ĸ�����
 * 
 * jdk1.7��֮ǰ�ӿڵ����:ֻ���й����ľ�̬�ĳ���+�����ĳ��󷽷����
 * 		����:	public static final ��������  ������ = ��ֵ;
 * 		���η�Ĭ����:public static final Ĭ�ϵĿ���ʡ��,����ѡ���Ե�ʡ��
 * 		ʹ��: ����.��̬������
 * 
 * 		����:   public abstract ����ֵ���� ������(����);
 * 		���η�: public abstract Ĭ�ϵ�.����ʡ��,����ѡ���Ե�ʡ��
 * 		ʹ��: ʵ�������.���󷽷���
 * 
 * �ص�:
 * 	1.����ʵ���� ,��Ϊ���󷽷�
 * 	2.�̳�һ����extends ,ʵ��һ���ӿ�implements�ؼ���
 * 	3.��ֻ�ܵ��̳�,���ʵ�ֽӿ�
 * 	4.�ӿڵ�ʹ��:
 * 		�����ʵ����:��д���нӿ��е����г��󷽷�+��������
 * 		����ʵ����:������д���󷽷�+��������
 * 	5.һ����ֻ�ܵ��̳���,һ������Զ�ʵ�ֽӿ�
 * 	6.�ӿڲ��ܼ̳���,�ӿڿ��Զ�̳нӿ�,�ӿڲ���ʵ�ֽӿ�
 * 
 * jdk1.8��������:
 * 				1.Ĭ�Ϸ��� default,���Զ�����,��Ҫͨ��ʵ�������ʹ��,ʵ�����п��Զ�Ĭ�Ϸ���������д
 * 				2.��̬���� static,��Ҫͨ���ӿ���.��̬������ʹ��
 * 	
 */
public class InterfaceDemo01 {
	int a;
	 public static void main(String[] args) {
		// MyInterface.a=10;  ���� 
		System.out.println(MyInterface.a);
		
		MyImpl my=new MyImpl();
		my.haha();
		my.test();
		
		//MyInterface m=new MyInterface();
		
		//���Խӿ���Ĭ�Ϸ���  ʵ����������
		ImplB im=new ImplB();
		im.hehe();
		im.hehe2();
		//im.staticMethod();
		B.staticMethod();
		
		//�ӿڶ�̬
		B b=new ImplB();
	}
}

//����ʵ����
class Concrete extends MyImpl2{

	@Override
	public void haha() {
		System.out.println("hhhhhhhhhh");
	}
	
}

//����ʵ����
abstract class MyImpl2 implements MyInterface,A{

	@Override
	public void test(){
		System.out.println("ʵ����....");
	};
	
	//void haha();
	
}

//ʵ����:����ʵ����,����ʵ������ʵ����
class MyImpl implements MyInterface,A{

	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void haha() {
		System.out.println("����ֹ�ںǺ�...,΢Ц");
	}
	
}

//�ӿ�
interface MyInterface{
	//�����ľ�̬�ĳ���
	int a=5;
	
	//���󷽷�
	void test();
}

interface A{
	void haha();
}

interface B{
	public default void hehe(){
		System.out.println("���ǽӿ��е�Ĭ�Ϸ���");
	}
	public default void hehe2(){
		System.out.println("���ǽӿ��е�Ĭ�Ϸ���22222");
	}
	//��̬����
	static void staticMethod(){
		System.out.println("���ǽӿ��еľ�̬����");
	}
}

//ʵ����
class ImplB implements B{
	@Override
	public void hehe2(){
		System.out.println("���Ǳ���д���Ǹ�Ĭ�Ϸ���");
	}
}


interface C extends B,A{}
