package com.javase.day07.oop;
/*
 * ����С������
 * 
 * ��ʹ��  angel  ��ʹ��ֹ��һ��,ÿһ����ʹ��������ͬ,�Լ����ڴ��������ͼ
 */
public class CarTest02 {
	public static void main(String[] args) {  //main  ->alt+/ ��ݼ�
		//1.��������  car�����һ������  new��������
		Car01 car=new Car01();  
		
		//2.�����Ը�ֵ
		car.color="����ɫ";
		car.brand="��ɯ";
		car.num=4;
		
		//3.ʹ�ù���
		car.run();
		
	}
}
