package com.javase.day10.design02;
/*
 * ����ʽ
 *  1.������˽�л�
 *  2.�ṩһ��˽�е�,��̬�ĸ��������
 *  3.��̬�Ĺ����ķ��ʷ�ʽ
 */
public class SingleTon {
	private static SingleTon singleTon=new SingleTon();
	
	private SingleTon(){}
	
	public static SingleTon newInstance(){
		return singleTon;
	}
}
