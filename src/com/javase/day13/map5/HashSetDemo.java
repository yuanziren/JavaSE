package com.javase.day13.map5;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.Set���ϲ���װ�ظ�Ԫ�ء�ֻ�ܱ���һ��
 * 2.Set��������װ��˳������ѭ��һ��
 * 3.HashSetȥ�ر���Ҫ��дHashCode()������equals()��������һ��������
 * 4.����Ԫ�ؿ�����null,��ֻ�ܷ���һ��null
 * @author Administrator
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		//1.Set���ϲ���װ�ظ�Ԫ�ء�ֻ�ܱ���һ��
		set.add("hello");
		set.add("hello");
		set.add(1);
		set.add(1);
		//4.����Ԫ�ؿ�����null,��ֻ�ܷ���һ��null
		set.add(null);
		set.add(null);
		System.out.println(set);
		Set<Person> set2 = new HashSet<Person>();
		set2.add(new Person("��ǿ",18));
		set2.add(new Person("����",28));
		set2.add(new Person("����",16));
		set2.add(new Person("��г",32));
		set2.add(new Person("��г",32));
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
