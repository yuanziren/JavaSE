package com.javase.day07.oop;
/*
 * ������ʹ��       
 * 
 * ��ȥ����  
 * 	�м�������    ����   ����   
 * 	������һ������,����Ϊ�㶩ȥ��ͬ���ҵĻ�Ʊ,�鹥��,���Ƶ�
 */
public class AngelTest04 {

	public static void main(String[] args) {
		Angel03 angel1=new Angel03();
		Angel03 angel2=new Angel03();
		System.out.println(angel1==angel2);  //false
		System.out.println(angel1);  //����ĵ�ֵַ
		System.out.println(angel2);  //����ĵ�ֵַ
		
		angel1.name="����";
		angel1.swing=4;
		angel1.circle=false;
		
		angel2.name="�ϸ�";
		angel2.swing=6;
		angel2.circle=true;
		
		angel1.assist();
		angel2.assist();
		
		Angel03 angel3=angel1;
		System.out.println(angel3==angel1);
		
		//��������  :û�����ֵĶ���  ֻ��ʹ��һ��
		new Angel03().name="������";
		new Angel03().assist();
		
		//�ֲ�����  ʹ��ǰ�����������Ҹ�ֵ
		Angel03 angel4=null;    
		//System.out.println(angel4.name);    // NullPointerException
		
		//��������
		int[] arr=null;
		//System.out.println(arr[0]);
	}

}
