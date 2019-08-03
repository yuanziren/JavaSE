package com.javase.day09.work01;
//this指代当前new的对象,谁调用我我就执行谁
//在构造器中不能同时存在,this和显示的super都要在首行调用构造器不能同时存在,但是super可以隐式存在
public class Test02 {
	public static void main(String[] args) {
		Zi zi=new Zi();
	}
}

class Fu{
	public Fu() {
		System.out.println("父类空构造");
	}
	public Fu(int a) {
		System.out.println("父类带参构造");
	}
}
class Zi extends Fu{
	public Zi() {
		super();
//		this(3);
//		super(4);
		System.out.println("子类空构造");
	}
	
	public Zi(int a) {
		
		System.out.println("子类带参构造");
	}
}
