package com.javase.day08.work01;

import java.util.Scanner;

/*
 * 4.	����һ�������û��࣬Ҫ�������Ϣ���û� ID���û����롢 email ��ַ��
 * 		�ڽ������ʵ��ʱ������������Ϣ����Ϊ���캯���Ĳ������룬 �����û� ID ���û��������д��
 * 		���emailȱʡʱ email��ַ���û� ID �����ַ���"@gameschool.com"��
 */
public class User {
	//�û���
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
