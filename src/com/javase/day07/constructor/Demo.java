package com.javase.day07.constructor;
/*
 * new同时做了三件事情:
 * 	1.在堆中开辟空间
 * 	2.调用构造器为对象初始化信息
 * 	3.将地址返回给引用
 * 
 * 构造器|构造方法|函数
 * 	构造器的作用:
 * 		为对象初始化信息的,不是用来创建对象的
 *  构造器的语法:
 *  	修饰符 类名([参数]){
 *  	}  
 *  构造器的使用:
 *  	和new一起使用,不能通过方法名调用
 *  
 *  1.没有返回值类型,没有void
 *  2.构造器的名字必须与类名相同
 *  3.不需要return,但是可以使用return
 *  4.修饰符可以使用private,是能在当前类中创建对象
 *  5.不能使用final,abstract,static修饰
 *  6.构造器可以有多个,之间构成方法的重载
 *  
 *  注意:如果一个类中没有自定义任何构造器,这时候编译器会为我们提供一个空构造(没有参数的构造器)
 *  	如果有自定义构造器,编译器不会为你提供任何构造器
 *  
 *  
 */
public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d);
		
		Dog dog=new Dog("张二","柴犬");
//		dog.type="萨摩耶";
//		dog.name="张二狗";
		//dog.Dog();
		System.out.println(dog.name);
	}
	
	//空构造
	public Demo(){
		
	}
}

class Dog{
	String type;
	String name;
	
	public void lookHome(){
		System.out.println(name+"在看家...");
	}
	
	//空构造
	public Dog(){
		System.out.println("我是空构造");
	}
	
	//带参构造
	public Dog(String dogName){
		name=dogName;
		System.out.println("我是带参构造器");
	}
	
	//带参构造器
	public Dog(String dogName,String t){
		if(dogName.equals("张二狗")){
			System.out.println("这个狗的名字等于张二狗了");
			return;
		}
		name=dogName;
		type=t;
		System.out.println("我是带参构造器2");
	}
}
