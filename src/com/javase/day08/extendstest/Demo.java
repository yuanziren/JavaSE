package com.javase.day08.extendstest;
/*
 * 继承   子承父业
 * 	为什么使用继承?
 * 		为了提高类层面的代码复用
 *  如何使用继承?
 *  	子类   extends  父类
 *  
 *  特点:
 *  	1.子类继承了父类,就拥有了父类中所有的成员   
 *  	2.一个类可以多个子类,一个类只能继承一个类,单继承机制 ,可以多实现
 *  	3.子类是父类的延续|扩展
 *  
 *  父类|基类|超类: 被继承的类
 *  子类|派生类: 继承其他类的类
 *  
 *  继承的优点:
 *  	提高代码的复用性
 *  
 *  单继承的优点:  简单
 *  单继承的缺点:  不便于维护
 *  
 *  开发原则:  开闭原则  对扩展开放,对修改关闭
 *  
 *  猫猫  狗狗   貂   -->父类  使用继承
 */
public class Demo {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.name="因为";
		teacher.age=17;
		
		teacher.teach();
		teacher.info();
		
		Student stu=new Student();
		stu.name="马云";
		stu.age=18;
		stu.study();
		stu.info();
	
	}
}

//父类
class Person{
	String name;
	int age;
	String school;
	
	public void info(){
		System.out.println(name+"..."+age);
	}
}

//教师类
class Teacher extends Person{	
	String subject;
	
	public void teach(){
		System.out.println("授课...");
	}
	
}

//学生类
class Student extends Person{
	
	public void study(){
		System.out.println("学习...");
	}
}