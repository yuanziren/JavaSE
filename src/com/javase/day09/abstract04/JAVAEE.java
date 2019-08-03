package com.javase.day09.abstract04;
//具体子类,直接构建对象
public class JAVAEE extends Develop{

	@Override
	public void work() {
		System.out.println("BS开发.........");
	}
	
	//闭着眼睛敲代码
	public void closeEyesCode(){
		System.out.println("闭着眼睛敲代码...认真你就输了...");
	}
}
