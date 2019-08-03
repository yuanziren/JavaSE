package com.javase.day10.work01;
/*
 * 海鲜披萨
 * 配料信息
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
		System.out.println("配料信息是:"+info);
		System.out.println("名称是:"+getName());
		System.out.println("价格是:"+getPrice());
		System.out.println("大小是:"+getSize());
	}
}
