package com.javase.day13.set4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/*
 * Set : ����,������
 * 	HashSet:  ����HashMapά����
 * 		�ײ�ʵ��:��ϣ��ʵ��  (1.8����+����+�����)
 * 		�ŵ�:���,ɾ��,��ѯЧ�ʸ�
 * 		ȱ��:�����
 * 		������������HashSetȥ��:����дhashCode()-->1.�ȵ���hashcode()�����hashֵ��ͬ,�϶�����ͬһ������,hashcodeֵ��ͬ,�������equals
 * 				��дequals()�����Ƚ�����   ---2.�����,�Ƚ�ͬһ��Ͱ�ж���������Ƿ���ͬ
 * 		
 * 	TreeSet:
 */
public class Demo01 {
	public static void main(String[] args) {
		//����  ��ŵ�˳����ڲ���ʵ˳��,һ��	ȷ��˳��,����ı�
		Set set0=new HashSet();
		set0.add("hello");
		set0.add("hello");
		set0.add(1);
		set0.add(1);
		set0.add(null);
		set0.add(null);
		System.out.println(set0);
		
		Set<Person> set=new HashSet();
		set.add(new Person("������",20));
		set.add(new Person("������",18));
		set.add(new Person("������",19));
		set.add(new Person("�Ź���",20));
		set.add(new Person("�Ź���",20));
		
		System.out.println(set);
		System.out.println("===============");
		Person p=new Person("������",19);
		System.out.println(p.toString());
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//���ݱȽ�
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

