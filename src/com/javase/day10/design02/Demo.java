package com.javase.day10.design02;
/*
 * 简单工厂模式
 * 	
 */
public class Demo {
	public static void main(String[] args) {
//		BMW bmw=new BMW();
//		bmw.run();
		Car car=factory("QQ");
		car.run();
	}
	
	//造车功能
	public static Car factory(String name){
		Car car=null;
		if(name.equals("BMW")){
			car =new BMW();
		}else{
			car=new QQ();
		}
		return car;
	}
}

//抽象产品角色
interface Car{
	void run();
}

//具体产品角色
//BMW 
class BMW implements Car{
	@Override
	public void run() {
		System.out.println("一辆宝马再跑...");
	}
}

//QQ
class QQ implements Car{
	@Override
	public void run() {
		System.out.println("一辆QQ再跑...");
	}
}
