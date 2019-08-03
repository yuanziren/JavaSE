package com.javase.day10.design02;
/*
 * 静态代理模式
 * 	1.真实角色和代理角色要实现相同的接口|继承同一个父类
 *  2.代理角色持有真实角色的引用
 *  3.代理行为
 *  
 * 房东卖方|用户租房
 */
public class StaticProxy {
	public static void main(String[] args) {
		Manager manager=new Manager("李四");
		HR hr=new HR(manager);
		hr.addUser();
	}
}

//招聘接口 
interface AddUser{
	void addUser();
}

//真实角色  项目经理
class Manager implements AddUser{
	String name;
	
	public Manager(String name) {
		this.name=name;
	}

	@Override
	public void addUser() {
		System.out.println("面试录用....");
	}

}

//代理角色
class HR implements AddUser{
	//代理角色持有真实角色的引用
	Manager manager=null;
	
	public HR() {
		// TODO Auto-generated constructor stub
	}
	public HR(Manager manager) {
		this.manager=manager;
	}
	

	@Override
	public void addUser() {
		System.out.println("筛选简历  ");
		System.out.println("通知面试");
		manager.addUser(); //项目经理录用人
		System.out.println("谈薪资");
		System.out.println("签合同");
		
	}
	
}
