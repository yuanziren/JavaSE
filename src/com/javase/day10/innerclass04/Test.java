package com.javase.day10.innerclass04;

public class Test {
	public static void main(String[] args) {
		//��������������ʹ�ó�Ա�ڲ����е�����  �ڲ���Ķ���Ҫ�����ⲿ��Ķ���ʹ��
		Outer01 outer=new Outer01(); //�ⲿ��Ķ���
		outer.outter();
		//Outer01.Inner i=outer.new Inner();
		
		Outer01.Inner in=new Outer01().new Inner();
		in.test();
		
	}
}
