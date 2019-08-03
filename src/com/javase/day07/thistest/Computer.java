package com.javase.day07.thistest;
/*
 * this 指代当前对象,存放的就是当前对象的地址
 * 	1.在构造器的首行调用其他构造器
 * 		this([参数列表]);
 *  2.区分同名变量问题  属性名,形参名,局部变量
 *  	构造器中使用:this指代当前被new创建的对象
 *  	方法中使用:this指代当前调用成员方法的对象
 *  
 *  注意:
 *  	1.两个构造器的之间不能使用this相互调用
 *  	2.this不能使用在静态方法中
 *  	3.方法中使用成员时,如果不存在同名问题,默认省略了this.
 */
public class Computer {
	String brand;
	String color;
	double price;
	
	//构造器
	public Computer(){
		System.out.println("我是空构造");
	}
	
	public Computer(String brand,String color){
		//this("","",1); //调用空构造
		this.brand=brand;
		this.color=color;
		System.out.println("我是两个参数的构造器");
	}
	public Computer(String brand,String color,double price){
		this(brand,color);
		this.price=price;
		System.out.println("我是三个参数的构造器");
	}
	
	//普通方法
	public void test(){
		double price=1000;
		System.out.println("局部price="+price+"-->成员price="+this.price+this.brand); //就近原则
	}
}
