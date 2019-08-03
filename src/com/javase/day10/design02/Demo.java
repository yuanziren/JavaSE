package com.javase.day10.design02;
/*
 * �򵥹���ģʽ
 * 	
 */
public class Demo {
	public static void main(String[] args) {
//		BMW bmw=new BMW();
//		bmw.run();
		Car car=factory("QQ");
		car.run();
	}
	
	//�쳵����
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

//�����Ʒ��ɫ
interface Car{
	void run();
}

//�����Ʒ��ɫ
//BMW 
class BMW implements Car{
	@Override
	public void run() {
		System.out.println("һ����������...");
	}
}

//QQ
class QQ implements Car{
	@Override
	public void run() {
		System.out.println("һ��QQ����...");
	}
}
