package com.javase.day13.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//���
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);//[1, 2, 3, 4]
		//�޸�
		list.set(1, 666);
		System.out.println(list);//[1, 666, 3, 4]
		//ɾ��
		list.remove(3);//ɾ��ָ��������������
		System.out.println(list);//[1, 666, 3]
		//��ȡ
		System.out.println(list.get(2));//3
		
		//����
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");//1 666 3 
		}
		System.out.println();
		
		for (Integer i : list) {
			System.out.print(i + " ");//1 666 3 
		}
		System.out.println();
		
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");//1 666 3 
		}
		
	}
}
