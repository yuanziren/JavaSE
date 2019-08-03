package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList *****
 * 	�ײ�:�ɱ�����ʵ��,�������ڴ�ռ�
 * 		��̬����:����֮��ĳ�����ԭ���ȵ�1.5��,ʹ��copyOf���ж�̬����,��������:1,��ʼ����Ϊ10
 * 	�ŵ�:������������,����,���ٷ���Ч�ʸ�
 * 	ȱ��:���,ɾ��Ч�ʵ�
 * 	�̲߳���ȫ��,Ч�ʸ�
 * 
 * Vector:����
 * 	��ArrayList����һ��
 * 	�ײ�����ʵ��
 * 	��̬����:���ݺ�ĳ�����ԭ���ȵ�2��
 * 	�̰߳�ȫ��,Ч�ʵ�
 */
public class ArrayList03{
	public static void main(String[] args) {
		List<Person> list=new ArrayList();
		Person p1=new Person("����",27);
		Person p2=new Person("³��",25);
		
		list.add(p1);
		list.add(p2);
		System.out.println(list);
		//��Ҫ����Ƚ�������дequals����
		System.out.println(list.indexOf(new Person("³��",25)));  //1
		System.out.println(list.indexOf(p2));  //1,���ص��Ǹö����������е�����ֵ
	}
}

class Person{
	private String name;
	private int age;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
