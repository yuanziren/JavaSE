package com.javase.day11.enum07;

import java.util.Arrays;

/*
 * ö����  enum :�оٳ����п���
 * 
 * 1.���е�ö���඼��ʽ�̳���java.lang.Enum
 * 2.ö����Ҳ����,ö�����е������ֶ�,Ĭ���ǵ�ǰö�����͵�һ��ʵ��, public static final
 */
public class Enum07 {
	public static void main(String[] args) {
		//��ȡö�����ʵ�� 
		WeekDay day=WeekDay.Tues;
		System.out.println(day.name());
		//int ordinal()     ����ö�ٳ���������������ö�������е�λ�ã����г�ʼ��������Ϊ�㣩�� 
		System.out.println(day.ordinal());
		WeekDay[] week=day.values();
		System.out.println(Arrays.toString(week));
		
		System.out.println(day.getName());
		day.print();
		
		//switch ֧����ö�����͵�����
		switch(day){
		case Mon:
			System.out.println("��������һ,������");
			break;
		case Tues:
			System.out.println("�������ڶ�,������");
			break;
		}
	}
}

//ö����
enum WeekDay{
	Mon("����һ"),  //public static final WeekDay Mon=new WeekDay("����һ");
	Tues("���ڶ�"),
	Wed("������"),
	Sun("������");
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//˽�й�����
	private WeekDay(String name){
		this.name=name;
	}
	
	public void print(){
		System.out.println("������"+name);
	}
}