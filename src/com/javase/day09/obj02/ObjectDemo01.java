package com.javase.day09.obj02;
/*
 * Object �� �������� 
 * 	������ĸ���,java�������඼ֱ�ӻ��߼�Ӽ̳���Object
 * 
 * 	��ע�������÷��� 
 *  toString() ����ǰ�������ַ�����ʽ��ʾ
 *  		   �����ʮ�����Ƶĵ�ֵַ
 *  		 �ڴ�ӡһ�����������ʱ,Ĭ�ϵ��ö����toString()����
 *  	���ڶ������͵�����,�ڴ�ӡ����ʱ,һ����Ҫ��ӡ����Ļ�����Ϣ,Ҳ���ǳ�Ա���Ե�ֵ
 *  	������Ҫ���������������д,��������дtoString()��ӡ��ǰ��Ķ���ĳ�Ա���Ե�ֵ
 *  equals()
 *  	�Ƚ϶����Ƿ���ȵ�
 *  ==��equals֮�������:
 *  	==�Ƚϵ�ַ
 *  	equals�ȼ��������������,������Ҫ�����Զ�����д,����̳���Object���е�equals�����ȽϵĻ��Ƕ���ĵ�ַ
 *  	public boolean equals(Object obj) {
        	return (this == obj);
    	}
    	����ʵ�бȽ���������ʱ��,һ����Ҫ������������ֵ�ж��Ƿ����,������Ҫ������д
    	
    �κ���ϰ: ����һ���û���,1)����ֱ�Ӵ�ӡ�û��Ļ�����Ϣ     2)�Ƚ�2���û��Ƿ���ͬʱ��,�û���,����,��߶���ͬ�������������ͬ
 */
public class ObjectDemo01 extends Object{
	public static void main(String[] args) {
		Zi zi=new Zi();
		System.out.println(zi.toString());
		System.out.println(zi);
		
		Person p1=new Person("����",18);
		Person p2=new Person("������",17);
		Person p3 = new Person("����",18);
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		//==
		System.out.println(p1==p2);  //false
		System.out.println(p1==p3);
		System.out.println("�������������Ƿ���ͬ:"+p1.equals(p2));  //false
		System.out.println("�������������Ƿ���ͬ:"+p1.equals(p3));  //false
		
		//equals  ��д
		
		
		String str1=new String("abc");
		String str2=new String("abc");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(p1));
	}
}
class Person{
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public String toString(){
		return "name="+name+"-->age="+age;
	}
	
	//equals �����������������ͬ����һ������
	public boolean equals(Object anObject){
		//���ж���������ĵ�ַ,�����ַ��֤ͬ��Ϊ��ͬ����,���Կ϶���ͬ
		if(this==anObject){
			return true;
		}
		
		//��������anObject�Ƿ�Ϊһ��Person����,����ǲűȽ�����,����û�пɱ��Է���false
		if(anObject instanceof Person){
			Person p2=(Person)anObject;
			return (this.age==p2.age) && (this.name.equals(p2.name));
		}
		return false;
	}
}

class Fu {}
class Zi extends Fu{}
