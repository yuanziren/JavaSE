package com.javase.day09.obj02;
/*
 * Object 类 老祖宗类 
 * 	所有类的父类,java中所有类都直接或者间接继承自Object
 * 
 * 	关注两个常用方法 
 *  toString() 将当前对象以字符串形式显示
 *  		   对象的十六进制的地址值
 *  		 在打印一个对象的引用时,默认调用对象的toString()方法
 *  	对于对象类型的数据,在打印对象时,一般需要打印对象的基本信息,也就是成员属性的值
 *  	所以需要对这个方法进行重写,在子类重写toString()打印当前类的对象的成员属性的值
 *  equals()
 *  	比较对象是否相等的
 *  ==和equals之间的区别:
 *  	==比较地址
 *  	equals比价两个对象的内容,但是需要进行自定义重写,否则继承自Object类中的equals方法比较的还是对象的地址
 *  	public boolean equals(Object obj) {
        	return (this == obj);
    	}
    	在现实中比较两个对象时候,一般想要根据所有属性值判断是否相等,所以需要进行重写
    	
    课后练习: 定义一个用户类,1)可以直接打印用户的基本信息     2)比较2个用户是否相同时候,用户名,密码,身高都相同才是真是真的相同
 */
public class ObjectDemo01 extends Object{
	public static void main(String[] args) {
		Zi zi=new Zi();
		System.out.println(zi.toString());
		System.out.println(zi);
		
		Person p1=new Person("张三",18);
		Person p2=new Person("张三三",17);
		Person p3 = new Person("张三",18);
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		//==
		System.out.println(p1==p2);  //false
		System.out.println(p1==p3);
		System.out.println("两个对象内容是否相同:"+p1.equals(p2));  //false
		System.out.println("两个对象内容是否相同:"+p1.equals(p3));  //false
		
		//equals  重写
		
		
		String str1=new String("abc");
		String str2=new String("abc");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(p1));
	}
}
class Person{
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "name="+name+"-->age="+age;
	}
	
	//equals 两个对象如果年龄相同就是一个对象
	public boolean equals(Object anObject){
		//先判断两个对象的地址,如果地址相同证明为相同对象,属性肯定相同
		if(this==anObject){
			return true;
		}
		
		//参数对象anObject是否为一个Person对象,如果是才比较内容,不是没有可比性返回false
		if(anObject instanceof Person){
			Person p2=(Person)anObject;
			return (this.age==p2.age) && (this.name.equals(p2.name));
		}
		return false;
	}
}

class Fu {}
class Zi extends Fu{}
