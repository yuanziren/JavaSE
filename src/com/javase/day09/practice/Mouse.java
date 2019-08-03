package com.javase.day09.practice;
//鼠标类  实现usb接口才能在被电脑使用
public class Mouse implements USB{

	@Override
	public void openUSB() {
		System.out.println("开始使用鼠标");
	}

	@Override
	public void closeUSB() {
		System.out.println("结束使用鼠标");
	}

}
