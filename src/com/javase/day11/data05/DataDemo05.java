package com.javase.day11.data05;
/*
 * �����������Ͱ�װ��
 * 	byte		----Byte
 * 	short		----Short
 * 	int			----Integer
 * 	long		----Long
 * 	float		----Float
 * 	double		----Double
 *  char		----Character
 *  		int			Integer
 *  �Զ�װ��:������������-->��װ����
 *  		Integer			int
 *  �Զ�����:��װ����--->������������
 */
public class DataDemo05 extends Object{
	public static void main(String[] args) {
		int i1=121;
		Integer in1=121;  //�Զ�װ��    Integer.valueOf(121)
		System.out.println(in1+1); //�Զ�����   .intValue() 122
		int i2=in1;
		System.out.println(i2);  //�Զ�����  121
		
		Double double1=new Double(12.1);
		System.out.println(double1);// 12.1
		
		/*
		 * Integer(int value) 
		          ����һ���·���� Integer ��������ʾָ���� int ֵ�� 
		   Integer(String s) 
		          ����һ���·���� Integer ��������ʾ String ������ָʾ�� int ֵ�� 
		 */
		Integer in2=new Integer(121);//121
		System.out.println(in2);
//		Integer in3=new Integer("121abc");  //�Ǵ�����תInteger���׳��쳣 NumberFormatException
//		System.out.println(in3);
		
		String str="abc123";
//		System.out.println(Integer.valueOf(str)); //NumberFormatException
		
		//static int parseInt(String s,����)     ���ַ���������ָ���Ľ����������н����� 
		int i=Integer.parseInt("012",8); 
		System.out.println(i);// 10
		
		
	}
}
