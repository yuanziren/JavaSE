package com.javase.day09.practice;
/*
 * 电脑类 USB接口可以外接设备
 * 	电脑   鼠标  键盘
 *  USB 接口
 *  	定义规范
 *  	打开usb设备
 *  	关闭usb设备
 *  鼠标:必须要实现usb接口
 *  电脑:使用实现了USB接口的设备
 *  
 */
public class Computer {
	//开机
	public void open(){
		System.out.println("开机...");
	}
	
	//使用usb设备
	//返回值:不需要     参数:需要参数   实现了usb接口的设备
	public void useUSB(USB u){  //父接口,接口多态  USB u=new Mouse();  USB u=new KeyBoard();  
		if(u!=null){
			u.openUSB();
			u.closeUSB();
		}else{
			System.out.println("不好意思,鼠标丢了...");
		}
	}
	
	//关机
	public void close(){
		System.out.println("关机...");
	}
}
