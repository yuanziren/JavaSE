package com.javase.day13.set4;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet:
 * 	�ײ�ʵ��:�����
 * 	�ŵ�:����(����,��洢˳���޹�),��ѯЧ�ʸ�
 * 	ȱ��:����û��HashSetЧ�ʸ�
 * 
 * �ڲ��Ƚ���:		ʵ��Comparable�ӿ�,��дcompareTo����,�Զ����������
 * �ⲿ�Ƚ���|�Զ���Ƚ���:  ʵ��     
 * 
 */
public class TreeSet02 {
	public static void main(String[] args) {
//		TreeSet tree=new TreeSet();
//		TreeSet tree=new TreeSet(new MyCompare());
		//�����ڲ���
		TreeSet tree=new TreeSet(new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		//Lambda���ʽ
		//TreeSet tree=new TreeSet((o1,o2)->{return ((User)o1).getAge()-((User)o2).getAge();});
		tree.add(new User("����",30));
		tree.add(new User("������",36));
		tree.add(new User("����ΰ",50));
		tree.add(new User("������",49));
		tree.add(new User("������",49));
		System.out.println(tree);
		
		
	}
}

//�Զ���Ƚ���
class MyCompare implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o2.getAge()-o1.getAge();
	}
	
}

//class User implements Comparable<User>{
class User{
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
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

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	//�Զ����������
	/*@Override
	public int compareTo(User o) {
		return this.age-o.age;
	}*/
}
