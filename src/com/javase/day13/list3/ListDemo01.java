package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List�ӿ�  
 * 	�ص�:���� ���ظ�
 * 	������һЩ�����������ķ���
 * 
 * ����
 * 	1.for..each
 * 	2.��ͨfor  ��������
 *  3.������
 */
public class ListDemo01 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		//���
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		list.add(0, 6);
		
		System.out.println(list);
		//ɾ��
		list.remove(0);
		System.out.println(list);
//		list.remove(5);  //������������������ͬʱ��,ֻ��ʶ���Ϊ����
		
		//�޸�
		list.set(0, 999);
		
		//��ȡ
		System.out.println(list.get(3));
		
		System.out.println(list);
		
		
		/*
		 * ����
		 * 	1.for..each
		 * 	2.��ͨfor  ��������
		 *  3.������
		 */
		//for..each
		for(Integer s:list){
			System.out.print(s + " ");
		}
		System.out.println();
		
		//��ͨfor
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//������
		//1/��ȡ����������
		
		/*for(Iterator<Integer> it=list.iterator();it.hasNext();){
			System.out.println(it.next());
		}*/
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
}
