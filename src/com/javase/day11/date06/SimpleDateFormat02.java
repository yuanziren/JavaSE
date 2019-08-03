package com.javase.day11.date06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  SimpleDateFormat ��ʽ��
 *  y ��
 *  M ��
 *  d ��
 *  H 24Сʱ
 *  h 12Сʱ
 *  m ��
 *  s ��
 *  S ����
 *  
 *  1.format ���ڶ���ת�ַ���,ָ����ʽת�� 
 *  2.parse �ַ���ת���ڶ���
 *  1s=1000ms
 */
public class SimpleDateFormat02 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(); //���ݿչ��촴������,Ĭ��ת����ʽ
		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss"); //���ݿչ��촴������,Ĭ��ת����ʽ
		//���ڶ���תΪ�ַ���
		System.out.println(simpleDateFormat2.format(new Date()));;
		//�ַ���תΪ���ڶ���
		String str="2019/03/28 ������  16:39:06";
		SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("yyyy/MM/dd E HH:mm:ss");
		System.out.println(simpleDateFormat3.parse(str).getTime());
		
	}
}
