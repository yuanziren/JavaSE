package com.javase.day13.set4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/*
 * Set : 无序,不可重
 * 	HashSet:  是由HashMap维护的
 * 		底层实现:哈希表实现  (1.8数组+链表+红黑树)
 * 		优点:添加,删除,查询效率高
 * 		缺点:无序的
 * 		引用数据类型HashSet去重:先重写hashCode()-->1.先调用hashcode()对象的hash值不同,肯定不是同一个对象,hashcode值不同,不会调用equals
 * 				重写equals()方法比较内容   ---2.后调用,比较同一个桶中对象的内容是否相同
 * 		
 * 	TreeSet:
 */
public class Demo01 {
	public static void main(String[] args) {
		//无序  存放的顺序和内部真实顺序,一旦	确定顺序,不会改变
		Set set0=new HashSet();
		set0.add("hello");
		set0.add("hello");
		set0.add(1);
		set0.add(1);
		set0.add(null);
		set0.add(null);
		System.out.println(set0);
		
		Set<Person> set=new HashSet();
		set.add(new Person("王祖贤",20));
		set.add(new Person("邱淑贞",18));
		set.add(new Person("张曼玉",19));
		set.add(new Person("张国荣",20));
		set.add(new Person("张国荣",20));
		
		System.out.println(set);
		System.out.println("===============");
		Person p=new Person("张曼玉",19);
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

	//内容比较
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

