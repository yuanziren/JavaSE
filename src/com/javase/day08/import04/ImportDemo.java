package com.javase.day08.import04;
/*
 * ע��:��Ҫ������jdk��ͬ�İ�����ͬ���࣬  ���������ܶ������Ī�����������
 * 
 * ����Ҫʹ��import������
		1��	���԰� ��java.lang���µ���
		2��	ͬ���µ���

	��̬����:���Ե��뾲̬������ 
	
	ģ��ƥ��:������������Ч��,�ή�ͱ���Ч��
	
	ʹ�������ⲿ������뷽ʽ:
					1.import����
					2.дȫ�� java.util.Random ran1=new java.util.Random();  ֻ�ڵ�ǰ����Ч
	
 */
import static java.lang.Math.PI;
import static java.lang.Math.round;
import static java.lang.System.out;

//import java.util.*;
public class ImportDemo {
	public static void main(String[] args) {
		out.println(PI);
		out.println(round(1.2));
		
		//Scanner sc=new Scanner(System.in);
		
		java.util.Random ran=new java.util.Random();
		
		java.util.Random ran1=new java.util.Random();
	}
}
