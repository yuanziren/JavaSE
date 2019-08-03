package com.javase.day10.work01;
/*
 * ��������
 * ������Ϣ
 */
public class SeaPizza extends Pizza{
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public SeaPizza() {
		// TODO Auto-generated constructor stub
	}

	public SeaPizza(String name, double price, int size, String info) {
		super(name, price, size);
		this.info = info;
	}
	
	@Override
	public void show() {
		System.out.println("������Ϣ��:"+info);
		System.out.println("������:"+getName());
		System.out.println("�۸���:"+getPrice());
		System.out.println("��С��:"+getSize());
	}
}
