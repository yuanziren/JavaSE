package com.javase.day08.javabean;

public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person(); 
		p.name="�¼ѱ�";
		//p.age=-23;  age����˽����
		p.setAge(-18);
		
		p.info();
		System.out.println(p.getAge());
	}
}
