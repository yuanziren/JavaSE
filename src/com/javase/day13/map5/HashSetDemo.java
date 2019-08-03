package com.javase.day13.map5;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.Set集合不可装重复元素。只能保留一个
 * 2.Set集合无序，装入顺序和输出循序不一致
 * 3.HashSet去重必须要重写HashCode()方法和equals()方法，少一个都不行
 * 4.集合元素可以是null,但只能放入一个null
 * @author Administrator
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		//1.Set集合不可装重复元素。只能保留一个
		set.add("hello");
		set.add("hello");
		set.add(1);
		set.add(1);
		//4.集合元素可以是null,但只能放入一个null
		set.add(null);
		set.add(null);
		System.out.println(set);
		Set<Person> set2 = new HashSet<Person>();
		set2.add(new Person("富强",18));
		set2.add(new Person("民主",28));
		set2.add(new Person("文明",16));
		set2.add(new Person("和谐",32));
		set2.add(new Person("和谐",32));
		set2.add(null);
		set2.add(null);
		System.out.println(set2);
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		super();
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
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
