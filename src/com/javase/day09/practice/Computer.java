package com.javase.day09.practice;
/*
 * ������ USB�ӿڿ�������豸
 * 	����   ���  ����
 *  USB �ӿ�
 *  	����淶
 *  	��usb�豸
 *  	�ر�usb�豸
 *  ���:����Ҫʵ��usb�ӿ�
 *  ����:ʹ��ʵ����USB�ӿڵ��豸
 *  
 */
public class Computer {
	//����
	public void open(){
		System.out.println("����...");
	}
	
	//ʹ��usb�豸
	//����ֵ:����Ҫ     ����:��Ҫ����   ʵ����usb�ӿڵ��豸
	public void useUSB(USB u){  //���ӿ�,�ӿڶ�̬  USB u=new Mouse();  USB u=new KeyBoard();  
		if(u!=null){
			u.openUSB();
			u.closeUSB();
		}else{
			System.out.println("������˼,��궪��...");
		}
	}
	
	//�ػ�
	public void close(){
		System.out.println("�ػ�...");
	}
}
