package com.javase.day11.date06;

import java.util.Date;

/*
 * Date������
 * 	������:
 * 		Date() �Ա���ʱ�乹�����ڶ���
 * 		Date(long time) �Բ�����������1970 �� 1 �� 1 �� 00:00:00��ʼ����
 * 	1.����java.util.Date	
 * 	2.������������1970 �� 1 �� 1 �� 00:00:00 GMT��Ϊ׼
 */
public class Date01 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		//System.out.println(date.toString().length());
		
		//long getTime()   ������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ������� 
		System.out.println(date.getTime());
		Date date2=new Date(1551428482079L);
		System.out.println(date2);
		System.out.println(date==date2);
		// boolean equals(Object obj)      �Ƚ��������ڵ�����ԡ�
		System.out.println(date.equals(date2));  //true
		
		/*
		 * boolean after(Date when) 
		          ���Դ������Ƿ���ָ������֮�� 
		 boolean before(Date when) 
		          ���Դ������Ƿ���ָ������֮ǰ�� 
		 */
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		
		/*
		 * int compareTo(Date anotherDate)    �Ƚ��������ڵ�˳�� 
		 */
		System.out.println(date.compareTo(date2));  //1
		
		
		//static long currentTimeMillis()       �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣 
		System.out.println(System.currentTimeMillis());
		System.out.println(date.getTime());
	}
}
