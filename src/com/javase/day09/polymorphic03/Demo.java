package com.javase.day09.polymorphic03;
/*面向对象的三大特性之一:多态
 * 多态:一个事物的多种形态|多种表示形式
 * 
 * 多态的前提:
 * 		   继承关系
 * 多态的最终体现:
 * 		 父类的引用指向子类对象
 * 多态的目的:
 * 		多态的引用调用的是子类中重写的方法,没有重写找父类的
 * 	
 * 多态形式使用成员:
 * 		成员变量: 编译运行看父类
 * 		成员方法:	编译看父类,运行看子类,子类中有重写找重写,没有重写找父类
 * 
 * 注意:多态对于子类新增方法不可见
 * 
 * 
 * 转型cast: 引用数据类型 
 * 	基本数据类型:自动类型提升   强制类型转换
 * 	向上转型:小范围->大范围   自动发生 -->自动类型提升
 * 	向下转型: 大范围->小范围  强制发生 -->强制类型转换
 * 	父子类关系,子类小范围   父类大范围
 * 
 * 转型异常:类型转换异常:ClassCastException
 * 引用  instanceof 类名   运算符
 * 判断前面引用是否是后面类型的对象|实例,如果是返回true,如果不是false
 * 
 */
public class Demo {
	public static void main(String[] args) {
//		Person p=new Person();
//		Student s=new Student();
		//向上转型  
		Person p=new Student();
		//自动类型提升
		long l=1;
		//强制类型转换
		int i=(int)l;
		//向下转型
		//Student s= (Student) p; 
		//Student s=new Student();
		//s.test2();
		//s.test();
		
		//多态使用成员方法
		p.test();
		//p.test2();
		
		//多态使用成员变量
		System.out.println(p.a);
		
		//想要让p能够调用子类中新增的那个方法
		//需要向下转型
		
		//转型注意问题  ClassCastException
		if(p instanceof Teacher){
			Teacher t=(Teacher)p;  
			t.test2();
		}
		// A true,false,Teacher,Person
		System.out.println("p instanceof Teacher: " + (p instanceof Teacher));
		
		
		Person t=new Teacher(); //向上转型
		t.test();
		
		System.out.println(new D().toString());
	}
}

class Person{
	int a=5;
	void test(){
		System.out.println("父类test方法");
	}
}
class Student extends Person{
	int a=10;
	void test(){
		System.out.println("子类test方法");
	}
	
	void test2(){
		System.out.println("子类新增方法");
	}
}

class Teacher extends Person{
	void test2(){
		System.out.println("子类新增方法tttttt");
	}
}

interface I{
	
}

class D implements I{}