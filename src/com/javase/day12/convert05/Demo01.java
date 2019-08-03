package com.javase.day12.convert05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 	����:
 * 		���뼯:����ʶ�ĵ��������ʶ��  �ַ�-->�ֽ�    
 * 		���뼯:�������ʶ�ĵ�����ʶ��  �ֽ�-->�ַ�
 * 
 *  ������������:
 *  	1.��������ʽ��ͬһ
 *  	2.���ȶ�ʧ
 */
public class Demo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//����
		String str="����"; 
		System.out.println(Arrays.toString(str.getBytes()));  //utf-8
//		System.out.println(new String(str.getBytes("gbk"),"gbk"));
		System.out.println(new String(str.getBytes(),0,2));
		
		/*
		 * ISO-8859-1  1��
		 * GB2312		2��
		 * GBK			2��
		 * UTF-8		3��
		 */
		System.out.println("��".getBytes("ISO-8859-1").length);
		System.out.println("��".getBytes("GB2312").length);
		System.out.println("��".getBytes("GBK").length);
		System.out.println("��".getBytes("UTF-8").length);
		
		
	}
}
