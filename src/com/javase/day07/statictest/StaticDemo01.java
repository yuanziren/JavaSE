package com.javase.day07.statictest;

/*
 * 测试java中的static  静态的    成员修饰符
 * 	1.static修饰变量  |类变量|静态变量
 * 		static只能用来修饰成员,不能用来修饰局部
 * 		静态的变量只有一份
 * 	2.static修饰方法  类方法|静态方法
 * 
 * 	静态的内容使用方式:
 * 				1.类名.静态内容
 * 					 .静态变量名
 * 					 .静态方法(参数列表)
 * 				2.对象.使用
 * 					数据类型  引用 =new 数据类型 ();
 * 						引用.静态变量名
 * 						引用.静态方法名(参数列表);
 * 		
 * 
 *  静态的内容都是属于类的,成员的内容都是属于对象的
 *  1.静态的内容会在类加载的时候初始化一次  
 *  2.在非静态的内容中可以直接使用静态的内容,也可以直接使用非静态的内容
 *  3.在静态的内容只能直接使用静态的内容,不可以直接使用非静态的内容
 * 	
 */
public class StaticDemo01 {
	//static修饰成员变量
	static int id=5;
	//成员变量    
	int age;
	public static void main(String[] args) {
		//static不能用来修饰局部变量
		//static int a=3;
		
		//使用静态内容
		System.out.println(id);  //5
		System.out.println(StaticDemo01.id);  //5
		StaticDemo01 staticDemo=new StaticDemo01();
		System.out.println(staticDemo.id);  //5
		System.out.println(staticDemo.age);  //0
		//静态内容中可以直接使用静态的内容
		test1();  //  id=6      staticDemo.age=  1  
		System.out.println(staticDemo.id);  //6
		System.out.println(staticDemo.age);  //0
		test1();   //  id=7      staticDemo.age=   1
		System.out.println(staticDemo.id);  //7
		System.out.println(staticDemo.age);  //0
		
		staticDemo.test2();
		System.out.println(staticDemo.id);  //8
		System.out.println(staticDemo.age);   //1
		
		StaticDemo01 staticDemo2=new StaticDemo01();
		staticDemo2.age=10;
		staticDemo.test2();
		System.out.println(staticDemo.id);  //8
		System.out.println(staticDemo2.age);   //1
	}
	
	/*
	 * 改变id和age的值 
	 */
	public static void test1(){
		id++;   
		StaticDemo01 staticDemo=new StaticDemo01();
		staticDemo.age++;
		System.out.println("id="+id+"---->age="+staticDemo.age);
	}
	
	/*
	 * 成员方法
	 */
	public void test2(){
		System.out.println("我是成员方法");
		id++;
		this.age++;
		System.out.println("id="+id+"---->age="+this.age); //id=8   age=1
	}
}
