package com.javase.day07.oop;
/*
 * ������
 * 	����: ����   �Ա�
 * 	����: ���Ƶ�   �鹥��  ����Ʊ
 * 
 */
public class Secretary06 {
	//���� 
	String name;
	//�Ա�
	String gender;
	
	//�鹥��  
	//����ֵ :����Ҫ����ֵ          ����:String countryName
	public void strategy(String countryName){
		gender="Ů";
		System.out.println(name+"�ڸ����ȥ"+countryName+"�Ĺ���...");
	}
	
	//���Ƶ�
	public void book(Country05 country){  //Country05 country=new Country05();
		System.out.println(name+"����Ϊ��Ԥ��"+country.name+"��"+country.hotel);
	}
}
