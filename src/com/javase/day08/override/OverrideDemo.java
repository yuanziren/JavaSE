package com.javase.day08.override;
/*
 * ���ػ�����д����ָ������
 * ����: 
 * 		ͬһ����
 * 		���������������ͬ
 * 		����ǩ����ͬ
 * ��д  
 * 		��ͬ����
 * 		�̳й�ϵ
 * 		����ǩ����ͬ
 * 
 * ����Ƿ�Ϊ��д����:
 * 				1.��ߵ����ϵ�������
 * 				2.�������������@Override
 * 
 * ���������������д����,��ֱ�ӵ�����������д����,��Ը����е�ͬ��������������
 * 
 * �Ӹ�������д������������:
 * 	 == : ����ǩ��������ͬ
 *   <= : ����ֵ����      �����������ͱ�����ͬ,������������  ������д�����ķ���ֵ����<=������ͬ�������ķ���ֵ����
 *   >= : ���η�  ��������д���������η�>=���෽����Ȩ�����η�
 *   
 *  ע��:
 *  	1.��private���εķ������ܱ���д
 *  	2.��final���εķ������ܱ���д
 *  	3.��static���εķ������ܱ���д
 *  		���������븸����static����ͬ���ķ���,�����е��������ҲҪ��static����
 * 
 * 
 *  final���յ�
 *  	1.��final���ε��಻�ܱ��̳�|̫����
 *  	2.��final���εķ������ܱ���д
 *  	3.��final���εı������ܱ��޸�
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.addWater();
		Apple.addWater();
		
		Fruit f=new Fruit();
		f.addWater();
	}
}

class Fruit{
	
	public static int addWater(){
		System.out.println("����ˮ��,���ܲ�ˮ...");
		return -1;
	}
}

class Apple extends Fruit{
	//@Override
	public static int addWater(){
		System.out.println("����ˮ��,���ܲ�ˮ...���ܲ���ά����...");
		return -1;
	}
}