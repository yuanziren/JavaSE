package com.javase.day10.innerclass04;
/*
 * �ֲ��ڲ���  
 * 	������,�����е��ڲ�����Ǿֲ��ڲ���
 * 	1.����ʹ�ó�Ա���η�����,public,private,protected,static����,final����
 *  2.�ֲ��ڲ���ֻ���ڵ�ǰ����ֲ��ڲ����еķ���ʹ��,�ⲿ�������λ���޷�ʹ��
 *  3.�ֲ��ڲ��������ʹ�����ڵķ����Ĳ���,����ǩ���������final����,jdk1.8֮��Ĭ��final
 */
public class Outer04 {
	int a=5;
	static int b=15;
	
	
	public Outer04() {
		class Inner{
			void inner(){
				System.out.println(a);
				System.out.println(b);
				
			}
		}
	}
	
	//��Ա����
	void test(final int args){
		final int c=5;
		//�ֲ��ڲ���
		class Inner{
			void inner(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				
				System.out.println(args);
			}
		}
		
		Inner in=new Inner(); 
		in.inner();
	}
	
	void outter(){
		System.out.println("�ⲿ���еĳ�Ա����");
		//Inner in=new Inner();
	}
}
