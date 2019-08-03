package com.javase.day07.statictest;

/*
 * ����java�е�static  ��̬��    ��Ա���η�
 * 	1.static���α���  |�����|��̬����
 * 		staticֻ���������γ�Ա,�����������ξֲ�
 * 		��̬�ı���ֻ��һ��
 * 	2.static���η���  �෽��|��̬����
 * 
 * 	��̬������ʹ�÷�ʽ:
 * 				1.����.��̬����
 * 					 .��̬������
 * 					 .��̬����(�����б�)
 * 				2.����.ʹ��
 * 					��������  ���� =new �������� ();
 * 						����.��̬������
 * 						����.��̬������(�����б�);
 * 		
 * 
 *  ��̬�����ݶ����������,��Ա�����ݶ������ڶ����
 *  1.��̬�����ݻ�������ص�ʱ���ʼ��һ��  
 *  2.�ڷǾ�̬�������п���ֱ��ʹ�þ�̬������,Ҳ����ֱ��ʹ�÷Ǿ�̬������
 *  3.�ھ�̬������ֻ��ֱ��ʹ�þ�̬������,������ֱ��ʹ�÷Ǿ�̬������
 * 	
 */
public class StaticDemo01 {
	//static���γ�Ա����
	static int id=5;
	//��Ա����    
	int age;
	public static void main(String[] args) {
		//static�����������ξֲ�����
		//static int a=3;
		
		//ʹ�þ�̬����
		System.out.println(id);  //5
		System.out.println(StaticDemo01.id);  //5
		StaticDemo01 staticDemo=new StaticDemo01();
		System.out.println(staticDemo.id);  //5
		System.out.println(staticDemo.age);  //0
		//��̬�����п���ֱ��ʹ�þ�̬������
		test1();  //  id=6      staticDemo.age=  1  
		System.out.println(staticDemo.id);  //6
		System.out.println(staticDemo.age);  //0
		test1();   //  id=7      staticDemo.age=   1
		System.out.println(staticDemo.id);  //7
		System.out.println(staticDemo.age);  //0
		
		staticDemo.test2();
		System.out.println(staticDemo.id);  //8
		System.out.println(staticDemo.age);   //1
		
		StaticDemo01 staticDemo2=new StaticDemo01();
		staticDemo2.age=10;
		staticDemo.test2();
		System.out.println(staticDemo.id);  //8
		System.out.println(staticDemo2.age);   //1
	}
	
	/*
	 * �ı�id��age��ֵ 
	 */
	public static void test1(){
		id++;   
		StaticDemo01 staticDemo=new StaticDemo01();
		staticDemo.age++;
		System.out.println("id="+id+"---->age="+staticDemo.age);
	}
	
	/*
	 * ��Ա����
	 */
	public void test2(){
		System.out.println("���ǳ�Ա����");
		id++;
		this.age++;
		System.out.println("id="+id+"---->age="+this.age); //id=8   age=1
	}
}
