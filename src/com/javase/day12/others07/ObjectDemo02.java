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
 * ������:����������͵�����
 * ���л������  ObjectOutputStream
 * �����л�������  ObjectInputStream
 * ��������:Object readObject()  �� ObjectInputStream ��ȡ���� 
 * 		  void writeObject(Object obj)   ��ָ���Ķ���д�� ObjectOutputStream�� 

 * ע��:
	 * �����л��ٷ����л� 
	 * �������е��඼�����л�  java.io.Serializable
	 * �������е����Զ�Ӧ�����л� transient
	 * ��̬�����ݲ������л�
	 * ������������л�������,����̳��˸���,��Ҳ�����л�������
	 * ������������л�������,����û��,������е����ݿ������л�,����Ĳ�����
 */
public class ObjectDemo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		write("D:/heihei.txt");
		read("D:/heihei.txt");
	}
	
	//���л������  д���ļ��ж������͵�����
	public static void write(String dest) throws FileNotFoundException, IOException{
		//1.������ϵ
		File file=new File(dest);
		//2.ѡ����
		ObjectOutputStream os=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		//3.׼������
		Person p=new Person("�ź�",26);
		//4.д��
		os.writeObject(p);
		//5.ˢ��
		os.flush();
		//6.�ر�
		os.close();
		
		p.setAge(20);
	}
	
	//�����л�������  ���ļ��ж���������͵�����
	public static void read(String src) throws IOException, ClassNotFoundException{
		//1.������ϵ
		File file=new File(src);
		//2.ѡ����
		ObjectInputStream is=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		//3.��ȡ����
		Object obj=is.readObject();
		if(obj instanceof Person){
			Person p=(Person)obj;
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p);
		}
		//4.�ر�
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
