package com.javase.demo02;
/**  
	����java�е������
		���������
		��ֵ�����
		��ϵ�����
		�߼������
		���������
		λ�����
		
		������:������������ߵ������ǲ�����   a+b
		���ʽ:������������ҵĲ���������������ʽ
		���:����;�������Ľ���;
		
		һԪ�����:������ֻ��һ�������������һԪ�����   ++ --  !
		��Ԫ�����:������ֻ�ж����������  + - * /
		��Ԫ�����:���������:��Ŀ�����
		
		���������
			+ 
				1)���� ����ʡ��
				2)�ӷ�����
				3)�ַ������ӷ�
					+���������Ƿ�����ַ���,����ַ�������Ϊ�ַ��������ӷ�ʹ��,��ƴ��һ�����ַ���
			-
				1)���� ����ʡ��
				2)��������
			*
			/
			% ȡ����|ȡģ|ģ��
				�����һ��������<�ڶ�����������ʱ��,���Ľ��Ϊ��һ��������
				
			++
			--
*/
public class Operator02{ 
	//��������
	public static void main(String[] args){
		int a = -5;
		System.out.println("a = " + a);  //"a=5"
		
		//תΪ�ַ���
		System.out.println(a+"");  //"5"
		
		System.out.println("hello"+'a'+1);  //"helloa1"  "helloa"+1
		System.out.println('a'+1+"hello");  //"98hello"  
		
		System.out.println(0%5);  //0 
		System.out.println(1%5);  //1 
		System.out.println(2%5);  //2  
		System.out.println(3%5);  //3
		System.out.println(4%5);  //4
		System.out.println(5%5);  //0
		System.out.println(6%5);  //0
		System.out.println(7%5);  //0
		System.out.println(8%5);  //0
		System.out.println(9%5);  //0
		System.out.println(7%32);  //0
		System.out.println(32%7);  //0
		
		
	}
}
