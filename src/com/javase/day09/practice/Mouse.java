package com.javase.day09.practice;
//�����  ʵ��usb�ӿڲ����ڱ�����ʹ��
public class Mouse implements USB{

	@Override
	public void openUSB() {
		System.out.println("��ʼʹ�����");
	}

	@Override
	public void closeUSB() {
		System.out.println("����ʹ�����");
	}

}
