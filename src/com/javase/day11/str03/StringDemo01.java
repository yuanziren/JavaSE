package com.javase.day11.str03;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com.javase.day08.javabean.Person;

/**
 * ������:�����õ�����
 *	  ���Ǹ���� 
 *		1.������
 *		2.��Ա����
 *		3.��̬����
 *	 String:�ַ���  ""���泣��ֵ����ΪString���͵�ʵ������
 *		�ײ����ַ����� char[] 
 *
 *	String ���ɱ䳤�ַ�������
 *	StringBuffer :�ɱ䳤�ַ�������
 *	StringBuilder :�ɱ䳤�ַ�������
 */
public class StringDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="abc"; //"abc"��һ��String����
		
		//String()  ��ʼ��һ���´����� String ����ʹ���ʾһ�����ַ����С�
		String str1=new String();  
		System.out.println("----------");
		System.out.println(str1);
		System.out.println("----------");
		
		
		//String(String original)  ��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ����ĸ�����
		String str2=new String("abc");
		String str3=new String("abc");
		String str4="abc";
		System.out.println(str2);//abc
		System.out.println(str3);
		System.out.println("----------");
		System.out.println(str2==str);  //false
		System.out.println("----------");
		System.out.println(str2.equals(str));  //true
		System.out.println("----------");
		System.out.println(str2==str3);  //flase
		System.out.println("----------");
		System.out.println(str==str4);  //true
		System.out.println("----------");
		
		//String(char[] value)   ����һ���µ� String��ʹ���ʾ�ַ���������е�ǰ�������ַ����С�
		String str5=new String(new char[]{'a','b','c'});
		System.out.println(str5);  //abc
		
		//String(char[] value, int offset, int count)   ����һ���µ� String��������ȡ���ַ��������һ����������ַ���
		String str6=new String(new char[]{'��','��','��','��'},2,2);
		System.out.println(str6);  //�й�
		
		//String(byte[] bytes)       ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
		byte[] arr="��Ϊ".getBytes();
		byte[] arr2="��Ϊ".getBytes("gbk");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		String str7=new String(new byte[]{67,68,69});
		//String(byte[] bytes, String charsetName) ͨ��ʹ��ָ���� charset ����ָ���� byte ���飬����һ���µ� String��
		String str8=new String(arr,"gbk");
		System.out.println(str7);
		System.out.println(str8);
		
		
		//String(byte[] bytes, int offset, int length) ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String��
		String str9=new String(arr,3,3);
		System.out.println(str9);
		
		/*
		 * String(StringBuffer buffer) 
		          ����һ���µ��ַ������������ַ��������������е�ǰ�������ַ����С� 
		   String(StringBuilder builder) 
		          ����һ���µ��ַ������������ַ��������������е�ǰ�������ַ����С� 

		 */
	}
}
