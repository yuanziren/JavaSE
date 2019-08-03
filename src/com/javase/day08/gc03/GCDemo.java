package com.javase.day08.gc03;
/*
 * �������ջ���
 * 	jvm�Զ����ն�������
 * 
 *  System.gc()  ֪ͨ����,֪ͨ�������ջ�������������,������ʲô��ʱ�������ղ�ȷ��
 *  
 *  finalize() �ڻ��������ĵ�һ������finalize()����,����������Լ�����,�����Լ���д��,�������java���ṩ��
 * 	һ�������finalize()�������������:
 * 								1)��������
 * 								2)����������״̬
 */
public class GCDemo {
	public static void main(String[] args) {
		//��������
		new GCDemo();
		System.gc(); //֪ͨ
		
		//����������
		GCDemo demo=new GCDemo();
		GCDemo demo2=demo;
		demo=null;
		System.gc();
	}
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("gameover....");
	}
}
