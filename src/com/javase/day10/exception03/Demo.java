package com.javase.day10.exception03;

public class Demo {
	public static void main(String[] args) {
		User user=new User();
		user.setName("宝玉");
		try {
			user.setAge(-18);
		} catch (IetegerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("----------------");
	}
}

//自定义异常类   直接或者间接继承自Exception
class IetegerException extends Exception{
	private String message;
	
	public IetegerException(int age){
		this.message=age+"年龄不合法";
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}

class User{
	private String name;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age) {
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

	public void setAge(int age) throws IetegerException {
		if(age>0){
			this.age = age;
		}else{
			throw new IetegerException(age);
		}
	}
}

