package com.javase.day09.polymorphic03;
/*����������������֮һ:��̬
 * ��̬:һ������Ķ�����̬|���ֱ�ʾ��ʽ
 * 
 * ��̬��ǰ��:
 * 		   �̳й�ϵ
 * ��̬����������:
 * 		 ���������ָ���������
 * ��̬��Ŀ��:
 * 		��̬�����õ��õ�����������д�ķ���,û����д�Ҹ����
 * 	
 * ��̬��ʽʹ�ó�Ա:
 * 		��Ա����: �������п�����
 * 		��Ա����:	���뿴����,���п�����,����������д����д,û����д�Ҹ���
 * 
 * ע��:��̬�������������������ɼ�
 * 
 * 
 * ת��cast: ������������ 
 * 	������������:�Զ���������   ǿ������ת��
 * 	����ת��:С��Χ->��Χ   �Զ����� -->�Զ���������
 * 	����ת��: ��Χ->С��Χ  ǿ�Ʒ��� -->ǿ������ת��
 * 	�������ϵ,����С��Χ   �����Χ
 * 
 * ת���쳣:����ת���쳣:ClassCastException
 * ����  instanceof ����   �����
 * �ж�ǰ�������Ƿ��Ǻ������͵Ķ���|ʵ��,����Ƿ���true,�������false
 * 
 */
public class Demo {
	public static void main(String[] args) {
//		Person p=new Person();
//		Student s=new Student();
		//����ת��  
		Person p=new Student();
		//�Զ���������
		long l=1;
		//ǿ������ת��
		int i=(int)l;
		//����ת��
		//Student s= (Student) p; 
		//Student s=new Student();
		//s.test2();
		//s.test();
		
		//��̬ʹ�ó�Ա����
		p.test();
		//p.test2();
		
		//��̬ʹ�ó�Ա����
		System.out.println(p.a);
		
		//��Ҫ��p�ܹ������������������Ǹ�����
		//��Ҫ����ת��
		
		//ת��ע������  ClassCastException
		if(p instanceof Teacher){
			Teacher t=(Teacher)p;  
			t.test2();
		}
		// A true,false,Teacher,Person
		System.out.println("p instanceof Teacher: " + (p instanceof Teacher));
		
		
		Person t=new Teacher(); //����ת��
		t.test();
		
		System.out.println(new D().toString());
	}
}

class Person{
	int a=5;
	void test(){
		System.out.println("����test����");
	}
}
class Student extends Person{
	int a=10;
	void test(){
		System.out.println("����test����");
	}
	
	void test2(){
		System.out.println("������������");
	}
}

class Teacher extends Person{
	void test2(){
		System.out.println("������������tttttt");
	}
}

interface I{
	
}

class D implements I{}