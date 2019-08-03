package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList *****
 * 	底层:可变数组实现,连续的内存空间
 * 		动态扩容:扩容之后的长度是原长度的1.5倍,使用copyOf进行动态扩容,加载因子:1,初始容量为10
 * 	优点:根据索引操作,遍历,快速访问效率高
 * 	缺点:添加,删除效率低
 * 	线程不安全的,效率高
 * 
 * Vector:向量
 * 	与ArrayList几乎一样
 * 	底层数组实现
 * 	动态扩容:扩容后的长度是原长度的2倍
 * 	线程安全的,效率低
 */
public class ArrayList03{
	public static void main(String[] args) {
		List<Person> list=new ArrayList();
		Person p1=new Person("文松",27);
		Person p2=new Person("鲁松",25);
		
		list.add(p1);
		list.add(p2);
		System.out.println(list);
		//想要对象比较内容重写equals方法
		System.out.println(list.indexOf(new Person("鲁松",25)));  //1
		System.out.println(list.indexOf(p2));  //1,返回的是该对象在容器中的索引值
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
