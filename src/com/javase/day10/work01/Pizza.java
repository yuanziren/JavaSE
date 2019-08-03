package com.javase.day10.work01;
/*
 * 披萨类
 * 	3)	属性：名称、价格、大小
	4)	方法：展示
 */
public abstract class Pizza {
	//名称
	private String name;
	//价格
	private double price;
	//大小
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

	//show  展示
	/*public void show(){
		System.out.println("名称是:"+name);
		System.out.println("价格是:"+price);
		System.out.println("大小是:"+size);
	}*/
	
	public abstract void show();
}
