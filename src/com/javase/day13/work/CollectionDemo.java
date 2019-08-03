package com.javase.day13.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		Collection col2 = new ArrayList();
		//���
		col.add("����");
		col.add("����");
		col.add(3);
		col.add(3);
		col.add("����");
		col.add("����");
		col2.addAll(col);
		System.out.println(col);//[����, ����, 3, 3, ����, ����]
		//�޸�
		System.out.println("û���޸ĵķ���");
		//ɾ��
		col.remove("����");
		System.out.println(col);//[����, ����, 3, 3, ����]
		/*col.removeAll(col);
		System.out.println(col);//[]*/		
		System.out.println(col2);//[����, ����, 3, 3, ����, ����]
		//����
		col2.add("����");
		System.out.println(col2.containsAll(col));//true
		//�Ƿ�Ϊ��
		System.out.println(col2.isEmpty());//false
		//���
//		col.clear();
		System.out.println(col);//[����, ����, 3, 3, ����]
		//�󳤶�
		System.out.println(col.size());//5
		//�󽻼�
		System.out.println(col);//[����, ����, 3, 3, ����]
		System.out.println(col2);//[����, ����, 3, 3, ����, ����, ����]
		System.out.println(col.retainAll(col2));//false
		System.out.println(col2.retainAll(col));//true
		System.out.println(col);
		System.out.println(col2);
		//ר����
		Object[] o = col.toArray();
		System.out.println(o);//[Ljava.lang.Object;@15db9742
		System.out.println(Arrays.toString(o));//[����, ����, 3, 3, ����]
	}
}
