package com.javase.day08.extendstest;
/*
 * �̳�   �ӳи�ҵ
 * 	Ϊʲôʹ�ü̳�?
 * 		Ϊ����������Ĵ��븴��
 *  ���ʹ�ü̳�?
 *  	����   extends  ����
 *  
 *  �ص�:
 *  	1.����̳��˸���,��ӵ���˸��������еĳ�Ա   
 *  	2.һ������Զ������,һ����ֻ�ܼ̳�һ����,���̳л��� ,���Զ�ʵ��
 *  	3.�����Ǹ��������|��չ
 *  
 *  ����|����|����: ���̳е���
 *  ����|������: �̳����������
 *  
 *  �̳е��ŵ�:
 *  	��ߴ���ĸ�����
 *  
 *  ���̳е��ŵ�:  ��
 *  ���̳е�ȱ��:  ������ά��
 *  
 *  ����ԭ��:  ����ԭ��  ����չ����,���޸Ĺر�
 *  
 *  èè  ����   ��   -->����  ʹ�ü̳�
 */
public class Demo {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.name="��Ϊ";
		teacher.age=17;
		
		teacher.teach();
		teacher.info();
		
		Student stu=new Student();
		stu.name="����";
		stu.age=18;
		stu.study();
		stu.info();
	
	}
}

//����
class Person{
	String name;
	int age;
	String school;
	
	public void info(){
		System.out.println(name+"..."+age);
	}
}

//��ʦ��
class Teacher extends Person{	
	String subject;
	
	public void teach(){
		System.out.println("�ڿ�...");
	}
	
}

//ѧ����
class Student extends Person{
	
	public void study(){
		System.out.println("ѧϰ...");
	}
}