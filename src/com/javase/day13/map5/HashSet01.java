package com.javase.day13.map5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		Set set = new HashSet();
		//add������������Ӷ���Ҳ�����null����nullֻ�����һ�Ρ�
		set.add("��");
		set.add("��");
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);
		set.add(new People("���",20));
		System.out.println(set);//�������[null, People [name=���, age=20], 1, 2, 3, ��]
		//remove������ɾ��
		set.remove(2);//[null, People [name=���, age=20], 1, 3, ��]
		System.out.println(set);
		//contains����������
		System.out.println(set.contains(3));;//true
		//clear���������
//		set.clear();
		//size������ȡ����
		System.out.println(set.size());;//5
		
		
		//��ǿfor
		for (Object o : set) {
			System.out.println(o);
		}
		
		//������
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
class People {
	private String name;
	private int age;
	public People() {
		super();
	}
	public People(String name, int age) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
		if (age != other.getAge())
			return false;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName()))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
