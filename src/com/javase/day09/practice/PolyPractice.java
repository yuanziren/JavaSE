package com.javase.day09.practice;
/*
 * 做题四大原则:
 * 1、继承链 、自己没有找父亲
 *   		A
 *   	  /   \
 *   	 B	   C
 * 2、编译看类型（确定方法表）、运行找对象  
 * 	成员方法:编译看左边|类型  运行看右边|对象
 * 
 * 3、就近最优原则：自己没有找父亲
 * 
 * 4、基类对子类新增方法不可见
 *   
 * 编译时确定方法表:多态能够调用的方法
 *   
 */
public class PolyPractice {
	public static void main(String[] args) {
		//多态  父类的引用指向子类对象
//		A a=new B();  //"B----test()   B----test(int)  A----test(double)
//		a.test(1.0);// A--double
//		a.test(1);  // B--int
//		a.test('1');// B--ints
		
		A a=new C();   //C----test()  C----test(int)  C----test(double)
		a.test(1.0);//c--double
		a.test(1);//c--int
//		a.test('s');// 子类新增方法对父类不可见
	}
}
class A{
	public void test(){
		System.out.println("A----test()");
	}
	public void test(int a){
		System.out.println("A----test(int)");
	}
	public void test(double a){
		System.out.println("A----test(double)");
	}
}
//没有新增方法,对父类所有方法进行重写
class C extends A{
	public void test(){
		System.out.println("C----test()");
	}
	public void test(double a){
		System.out.println("C----test(double)");
	}
	public void test(int a){
		System.out.println("C----test(int)");
	}
}
class B extends A{
	public void test(){
		System.out.println("B----test()");
	}
	public void test(int a){
		System.out.println("B----test(int)");
	}
	//新增方法对父类引用不可见
	public void test(char a){
		System.out.println("B----test(char)");
	}
}