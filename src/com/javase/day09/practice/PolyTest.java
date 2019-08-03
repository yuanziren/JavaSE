package com.javase.day09.practice;

/*
 * 做题四大原则:
 * 一、继承链:自己没有找父
 * 		A
 * 		|
 * 		B
 * 	 /    \
 *  C	   D
 * 二、 编译看类型、确定方法，运行找对象
 * 
 * 三、就近最优原则
 * 
 * 四、父类引用对子类新增方法不可见
 */

public class PolyTest {
	public static void main(String[] args) {
//		A a1=new A();  //A and D  A and A
//		A a2=new B();  //多态     A and D  B and A
//		B b =new B();  //B and B  B and A A and D
//		C c=new C();
//		D d =new D();	
//		System.out.println(a1.show(b));// A and A 
//		System.out.println(a1.show(c));//A and A 
//		System.out.println(a1.show(d));// A and D
//		System.out.println(a2.show(b));//  B and A
//		System.out.println(a2.show(c));// B and A
//		System.out.println(a2.show(d));// A and D
//		System.out.println(b.show(b));// B and B
//		System.out.println(b.show(c));// B and B
//		System.out.println(b.show(d));// A and D 
	}

}
/*class A{
	public String show(D obj){
		return ("A and D");
	}
	public String show(A obj){
		return ("A and A");
	}
}
class B extends A{
	public String show(B obj){
		return ("B and B");
	}
	public String show(A obj){
		return ("B and A");
	}
}
class C extends B{
}
class D extends B{
}


*/