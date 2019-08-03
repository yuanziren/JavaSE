package com.javase.day12.others07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 对象流:保存对象类型的数据
 * 序列化输出流  ObjectOutputStream
 * 反序列化输入流  ObjectInputStream
 * 新增方法:Object readObject()  从 ObjectInputStream 读取对象。 
 * 		  void writeObject(Object obj)   将指定的对象写入 ObjectOutputStream。 

 * 注意:
	 * 先序列化再反序列化 
	 * 不是所有的类都能序列化  java.io.Serializable
	 * 不是所有的属性都应该序列化 transient
	 * 静态的内容不会序列化
	 * 如果父类有序列化的能力,子类继承了父类,就也有序列化的能力
	 * 如果子类有序列化的能力,父类没有,子类独有的内容可以序列化,父类的不可以
 */
public class ObjectDemo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		write("D:/heihei.txt");
		read("D:/heihei.txt");
	}
	
	//序列化输出流  写到文件中对象类型的数据
	public static void write(String dest) throws FileNotFoundException, IOException{
		//1.建立联系
		File file=new File(dest);
		//2.选择流
		ObjectOutputStream os=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		//3.准备数据
		Person p=new Person("张涵",26);
		//4.写出
		os.writeObject(p);
		//5.刷出
		os.flush();
		//6.关闭
		os.close();
		
		p.setAge(20);
	}
	
	//反序列化输入流  从文件中读入对象类型的数据
	public static void read(String src) throws IOException, ClassNotFoundException{
		//1.建立联系
		File file=new File(src);
		//2.选择流
		ObjectInputStream is=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		//3.读取数据
		Object obj=is.readObject();
		if(obj instanceof Person){
			Person p=(Person)obj;
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p);
		}
		//4.关闭
		is.close();
	}
}

class Person implements Serializable{
	private String name;
	private static int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
