package com.javase.day09.work01;

public class Work01 {
	public static void main(String[] args) {
		ITPerson it=new ITPerson();
		it.setDer("java");
		it.setDer("py");
		System.out.println(it.getDer());
	}
}

class ITPerson{
	private int age;  //默认值15
	private String name;
	private String der;
	
	public ITPerson() {
		
	}
	public ITPerson(int age, String name) {
		super();
		this.age = age;
		this.setName(name);
	}
	//setter,getter快捷键: alt+shift+s-->o-->tab-->enter-->tab+shift-->enter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=15){
			this.age  = age;
		}else{
			System.out.println("年龄不合法...");
			this.age=15;
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDer() {
		return der;
	}
	public void setDer(String der) {
		if(this.der==null){
			this.der = der;
		}else{
			System.out.println(".........");
		}
	}
	
	
	
}