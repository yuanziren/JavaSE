package com.javase.day08.javabean;

public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person(); 
		p.name="³Â¼Ñ±ò";
		//p.age=-23;  ageÊôĞÔË½ÓĞÁË
		p.setAge(-18);
		
		p.info();
		System.out.println(p.getAge());
	}
}
