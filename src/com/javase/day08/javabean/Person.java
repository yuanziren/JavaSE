package com.javase.day08.javabean;
/*
 * �����ȫ��������:����һ���ؼ���  private  ˽�е�
 * 	private ��Ա���η� ,ֻ�����γ�Ա�������ξֲ�
 *  ��private���ε�����ֻ���ڱ�����ʹ��
 *  �����ṩ�����ķ��ʷ�ʽ  -> ������setter  ������getter
 *  �����ķ��������������������
 *  
 *  ˽�е����Բ��ṩ�����ķ��ʷ�ʽ�Ƿ�װ��һ������
 *  ��װ:��װ�ڲ������ʵ��ϸ��,�����ṩ�����ķ��ʷ�ʽ
 *  
 *  �ô���
	A:����ʵ��ϸ�ڣ��ṩ�����ķ��ʷ�ʽ
	B:��ߴ���ĸ�����
	C:��ߴ���İ�ȫ��

 *  
 *  ����������������֮һ:  ��װ  �̳�   ��̬
 *  
 *  ˽���Ƿ�װ,��װ����˽��  
 *  ����,��..���Ƿ�װ������
 *  
 *  �Ժ���Զ�����,Person.. ���е�����ȫ��˽��,���ṩ�����ķ��ʷ�ʽ
 *  
 *  JavaBean һϵ�����ͳ��,����javabean��дҪ���ģ����
 *  javaBean�������
	(1) javaBean��������Ϊpublic class���������ܹ����ⲿ�����ʣ�
	(2) һ��JavaBean�����ٴ���һ���޲ι��췽��
	(3)�������е����Զ������װ������ʹ��private������
	(4)Ϊ��װ��˽�������ṩ������setter��getter������

 */
public class Person {
	String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//������ Ϊ˽�е����Ը�ֵ
	//����ֵ :û�з���ֵ        ����:��Ҫ����
	public void setAge(int age){
		if(age<=0){
			this.age=1;
			return;
		}
		this.age=age;
	}

	//������ ��ȡage��ֵ
	//����ֵ:��Ҫ����ֵ       ����:����Ҫ
	public int getAge(){
		return this.age;
	}
	
	//info
	public void info(){
		System.out.println(name+"---->"+age);
	}
}
