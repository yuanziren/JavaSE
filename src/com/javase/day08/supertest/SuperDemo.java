package com.javase.day08.supertest;
/*
 * Super : 指代父类对象
 * this : 指代当前对象
 * 
 * 	调用父类构造器
 * 		如果没有显示使用super(参数)调用父类构造器的时候,会默认调用父类空构造
 * 		如果想要调用父类中的其他构造器,请使用super(参数)显示调用
 * 
 * 	区分子父类中同名成员
 * 		当子类与父类中存在同名成员的时候,使用this代替(子类对象)当前类对象,使用super代表父类对象,默认this.
 * 		如果还存在同名局部变量,默认使用就近原则找局部变量,this当期对象|子类对象,super指代父类对象
 *  先父类后子类
 *  super不能使用在static修饰的方法中,因为静态内容可以没有对象使用,而super和this在使用前必须存在对象
 */
public class SuperDemo {
	public static void main(String[] args) {
		Zi zi=new Zi();
		zi.test();
	}
}

class Fu{
	int a=5;
	String name;
	int age;
	int b=10;
	
	//alt+/  空构造
	public Fu() {
		System.out.println("我是父类空构造");
	}
	public Fu(int a) {
		this.a=a;
		System.out.println("我是父类带参构造构造");
	}
	
	public Fu(int a, String name, int age) {
		this.a = a;
		this.name = name;
		this.age = age;
	}

	void demo(){
		System.out.println("我是父类中的demo'");
	}
	
}

class Zi extends Fu{
	int b=5;
	public Zi() {
		//调用父类其他构造器
		//super();
		System.out.println("我是子类空构造");
	}
	
	public Zi(int a,String name, int age) {
		super(a,name,age);
	}

	void test(){
		int b=1;
		//可以使用super中存放就是父类对象的地址,可以调用父类中的成员变量和成员方法
		System.out.println(b);   //局部变量  1
		//System.out.println(this.b);  //子类中成员  5
		System.out.println(super.b);  //父类中的成员b  10
		
		super.demo();
	}
	
	void demo(){
		System.out.println("我是子类中的demo'");
	}
}
