package com.javase.day13.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * Collection ������ϵ�ĸ��ӿ�  ֻ�ܴ洢��������
 * 	 ����������ظ�����List,���ֲ�����Set
 *  ����ֻ�ܴ洢�����������͵�����,�������������Զ�װ��
 *  �������Դ洢�������͵�����
 */
public class Demo01 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		Collection col2=new ArrayList();
		
		//���
		col.add("����");
		col.add("����");
		col2.add(123);
		col2.add(456);
		col.addAll(col2);
		
		System.out.println(col);
		
		//ɾ��
		col.remove("����");
		//col.removeAll(col2);
		System.out.println(col);
		
		//��� clear
		//col2.clear();
		System.out.println(col2);
		
		//����
		System.out.println(col.contains("����"));
		System.out.println(col.containsAll(col2));
		
		//�ж��Ƿ�Ϊ��
		System.out.println(col.isEmpty());
		
		//size
		System.out.println(col.size());
		
		//�󽻼�
		System.out.println(col);
		System.out.println(col2);
		//System.out.println(col.retainAll(col2));//��col��col2�Ľ���������������������col
		System.out.println(col);
		System.out.println(col2);
		
		//ר����
		Object[] obj=col.toArray();
		System.out.println(Arrays.toString(obj));
		
	}
}
