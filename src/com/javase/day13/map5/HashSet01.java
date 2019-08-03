package com.javase.day13.map5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		Set set = new HashSet();
		//add（）；可以添加对象，也可添加null，但null只能添加一次。
		set.add("大宝");
		set.add("大宝");
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);
		set.add(new People("李白",20));
		System.out.println(set);//遍历结果[null, People [name=李白, age=20], 1, 2, 3, 大宝]
		//remove（）；删除
		set.remove(2);//[null, People [name=李白, age=20], 1, 3, 大宝]
		System.out.println(set);
		//contains（）；包含
		System.out.println(set.contains(3));;//true
		//clear（）；清空
//		set.clear();
		//size（）获取长度
		System.out.println(set.size());;//5
		
		
		//增强for
		for (Object o : set) {
			System.out.println(o);
		}
		
		//迭代器
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
