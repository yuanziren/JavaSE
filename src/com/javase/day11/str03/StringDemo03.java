package com.javase.day11.str03;
/*
 * String ���ɱ䳤�ַ���  ������   ����
 * StringBuilder :�ɱ䳤�ַ���,�̲߳���ȫ��,Ч�ʽϸ�
 * StringBuffer:�ɱ䳤�ַ���,�̰߳�ȫ��,Ч�ʽϵ�
 * 	Ĭ�ϳ�ʼ����Ϊ16���ַ�����
 * StringBuilder>StringBuffer>String 
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String str="abc";
	//	System.out.println(str.hashCode());
	//	str.replace('a', 'A');
		
		//StringBuilder() ����һ�����в����ַ����ַ�������������ʼ����Ϊ 16 ���ַ���
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//StringBuilder(int capacity)	����һ���ַ���������û��ָ�����ַ���һ����ʼ���� capacity�۵㡣
		sb=new StringBuilder(20);
		System.out.println(sb.capacity());
		
		//StringBuilder(String str) ����һ���ַ�����������ʼ��Ϊָ�����ַ��������ݡ� 
		sb=new StringBuilder("abc");  
		System.out.println(sb.capacity());  //19  16+str.length()
		
		//׷��  append(double d) ���� double�������ַ�����ʾ������С� 
		System.out.println(sb.length());
		System.out.println(sb.append(false));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//ɾ��   StringBuilder delete(int start, int end)    int end��������ȡ����
		System.out.println(sb.delete(2,4)); 
		System.out.println(sb);
		
		//ָ��λ�ò��� StringBuilder insert(int offset, String str)  
		sb.insert(2, "ffff");
		System.out.println(sb);
		
		//��ת  StringBuilder reverse()
		System.out.println(sb.reverse());
		
		String s=new String(sb);
		System.out.println(s);
		
		StringBuffer sb2=new StringBuffer("����");
		sb2.reverse();
		
		for(int i=0;i<=100;i++){
			s+="asdf";
		}
		
		//
		String string1="cde"; //1�� "cde"
		String string2=new String("cde"); //1�� new
		String string3=new String("fff");  //2�� new  "fff"
		String string4="a"+"b"+"c"+"d"; //String string4="abcd";  1��
		
		String str1="vv";  //1��
		String str2="hh";  //1��
		String str3=str1+str2;  //2��  new StringBuilder(str1)  .append(str2)   .toString"vvhh"
		
		
	}
}
