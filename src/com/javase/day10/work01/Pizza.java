package com.javase.day10.work01;
/*
 * ������
 * 	3)	���ԣ����ơ��۸񡢴�С
	4)	������չʾ
 */
public abstract class Pizza {
	//����
	private String name;
	//�۸�
	private double price;
	//��С
	private int size;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	public Pizza(String name, double price, int size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}

	//show  չʾ
	/*public void show(){
		System.out.println("������:"+name);
		System.out.println("�۸���:"+price);
		System.out.println("��С��:"+size);
	}*/
	
	public abstract void show();
}
