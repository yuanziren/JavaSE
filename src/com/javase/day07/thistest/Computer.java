package com.javase.day07.thistest;
/*
 * this ָ����ǰ����,��ŵľ��ǵ�ǰ����ĵ�ַ
 * 	1.�ڹ����������е�������������
 * 		this([�����б�]);
 *  2.����ͬ����������  ������,�β���,�ֲ�����
 *  	��������ʹ��:thisָ����ǰ��new�����Ķ���
 *  	������ʹ��:thisָ����ǰ���ó�Ա�����Ķ���
 *  
 *  ע��:
 *  	1.������������֮�䲻��ʹ��this�໥����
 *  	2.this����ʹ���ھ�̬������
 *  	3.������ʹ�ó�Աʱ,���������ͬ������,Ĭ��ʡ����this.
 */
public class Computer {
	String brand;
	String color;
	double price;
	
	//������
	public Computer(){
		System.out.println("���ǿչ���");
	}
	
	public Computer(String brand,String color){
		//this("","",1); //���ÿչ���
		this.brand=brand;
		this.color=color;
		System.out.println("�������������Ĺ�����");
	}
	public Computer(String brand,String color,double price){
		this(brand,color);
		this.price=price;
		System.out.println("�������������Ĺ�����");
	}
	
	//��ͨ����
	public void test(){
		double price=1000;
		System.out.println("�ֲ�price="+price+"-->��Աprice="+this.price+this.brand); //�ͽ�ԭ��
	}
}
