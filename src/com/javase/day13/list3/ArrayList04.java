package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList *****
 * 	�ײ�:�ɱ�����ʵ��,�������ڴ�ռ�
 * 		��̬����:����֮��ĳ�����ԭ���ȵ�1.5��,ʹ��copyOf���ж�̬����,��������:1,��ʼ����Ϊ10
 * 	�ŵ�:������������,����,���ٷ���Ч�ʸ�
 * 	ȱ��:���,ɾ��Ч�ʵ�
 * 	�̲߳���ȫ��,Ч�ʸ�
 * 
 * Vector:����
 * 	��ArrayList����һ��
 * 	�ײ�����ʵ��
 * 	��̬����:���ݺ�ĳ�����ԭ���ȵ�2��
 * 	�̰߳�ȫ��,Ч�ʵ�
 */
public class ArrayList04{
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("����");
		list.add("null1");
		list.add("null2");
		list.add("null3");
		list.add("null4");
		System.out.println(list);
		removeRange(list,2,4);
		System.out.println(list);
		
		/*
		 * protected  void removeRange(int fromIndex, int toIndex) 
          �Ƴ��б��������� fromIndex���������� toIndex����������֮�������Ԫ�ء� 
		 */
	}

	private static void removeRange(List list,int i, int j) {
		for (i = 0; i < j; i++) {
			
		}
		
	}
}
