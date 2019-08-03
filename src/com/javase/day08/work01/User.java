package com.javase.day08.work01;

import java.util.Scanner;

/*
 * 4.	定义一个网络用户类，要处理的信息有用户 ID、用户密码、 email 地址。
 * 		在建立类的实例时把以上三个信息都作为构造函数的参数输入， 其中用户 ID 和用户密码必须写，
 * 		如果email缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
 */
public class User {
	//用户名
	String name;
	//id
	int id;
	//email
	String email;
	
	public User(String name,int id) {
		this.name=name;
		this.id=id;
		this.email=id+"@gameschool.com";
	}
	
	public User(String name,int id,String email) {
		this.name=name;
		this.id=id;
		this.email=email;
	}
	
}
