package com.javase.day10.design02;
/*
 * ��̬����ģʽ
 * 	1.��ʵ��ɫ�ʹ����ɫҪʵ����ͬ�Ľӿ�|�̳�ͬһ������
 *  2.�����ɫ������ʵ��ɫ������
 *  3.������Ϊ
 *  
 * ��������|�û��ⷿ
 */
public class StaticProxy {
	public static void main(String[] args) {
		Manager manager=new Manager("����");
		HR hr=new HR(manager);
		hr.addUser();
	}
}

//��Ƹ�ӿ� 
interface AddUser{
	void addUser();
}

//��ʵ��ɫ  ��Ŀ����
class Manager implements AddUser{
	String name;
	
	public Manager(String name) {
		this.name=name;
	}

	@Override
	public void addUser() {
		System.out.println("����¼��....");
	}

}

//�����ɫ
class HR implements AddUser{
	//�����ɫ������ʵ��ɫ������
	Manager manager=null;
	
	public HR() {
		// TODO Auto-generated constructor stub
	}
	public HR(Manager manager) {
		this.manager=manager;
	}
	

	@Override
	public void addUser() {
		System.out.println("ɸѡ����  ");
		System.out.println("֪ͨ����");
		manager.addUser(); //��Ŀ����¼����
		System.out.println("̸н��");
		System.out.println("ǩ��ͬ");
		
	}
	
}
