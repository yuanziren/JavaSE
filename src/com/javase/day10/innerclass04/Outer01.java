package com.javase.day10.innerclass04;
/*
 * �ڲ���:���е���
 * 	
 * 	��Ա�ڲ���
 * 	��̬�ڲ���
 *  �ֲ��ڲ���
 *  �����ڲ��� : ****  Lambda
 *  
 *  ��Ա�ڲ���:
 *  		�ڲ��ඨ�����ⲿ��ĳ�Աλ��,���ⲿ��ĳ�ԱҲ��һ�����������,���԰�������Ϊһ���ڲ���
 *  �ڲ����������ص�:�̳�,ʵ��...
 *  ��Աλ�õ��ڲ���:�����Ա���ص�,����ʹ�ó�Ա���η�
 *  
 *  ��Ա�ڲ����п���ʹ���ⲿ���е����г�Ա,����˽�е�
 *  ��Ա�ڲ����в����Զ��徲̬������,���˾�̬�ĳ���
 *  ���ⲿ�������ʹ�ó�Ա�ڲ����е�����,ͨ���ڲ���Ķ���ʹ��
 */
public class Outer01 {
	private int a=5;
	
	//��Ա�ڲ���
	class Inner extends HaHa implements A{
		static final int b=12;
		int c=15;
		int a=9;
		
		
		public void test(){
//			System.out.println("����"+a);
			int a=15;
			System.out.println(a); //15   �ͽ�ԭ��  �ֲ�����a=15
			System.out.println(this.a); //  �ڲ����еĳ�Աa=9
			System.out.println(Outer01.this.a); //  �ⲿ���еĳ�Աa=5
		}
		//��Ա�ڲ����в����Զ��徲̬�����ݣ����˾�̬��������̬�ڲ����п��Զ��徲̬������
		/*static void content(){
			
		}*/
	}
	
	public void outter(){
		System.out.println("�����ⲿ���еĳ�Ա����");
		Inner in=new Inner();
		System.out.println(in.c); //15
		System.out.println(Inner.b); //12
		in.test();
	}
}

class HaHa{}
interface A{}
