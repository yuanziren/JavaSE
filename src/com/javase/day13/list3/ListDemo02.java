package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * ��list�����з�������Ӣ������,����������,���һ������ӳ�
 */
public class ListDemo02 {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("������");
		list.add("����");
		list.add("�ڹѸ�");
		list.add("����");
		list.add("���");
		list.add("����");
		System.out.println(list);
		
		//��ͨfor
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals("���")){
				list.add("����ӳ�");
			}
		}
		System.out.println(list);
		
		//��ǿfor  ConcurrentModificationException
		/*for(String s:list){
			if(s.equals("���")){
				list.add("����ӳ�");
			}
		}*/
		
		/*
		 * ������  oncurrentModificationException  ��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣��
		 */
		/*Iterator<String> it=list.iterator();
		while(it.hasNext()){
			if(it.next().equals("���")){
				list.add("����ӳ�");
			}
		}*/
		
		/*
		 * ListIterator<E> listIterator()   ���ش��б�Ԫ�ص��б�����������ʵ�˳�򣩡� 
		 */
		ListIterator<String> ls=list.listIterator();
		while(ls.hasNext()){
			if(ls.next().equals("���")){
				ls.add("����ӳ�");
			}
		}
		System.out.println(list);
		
		//����ʹ��ListIterator��boolean hasPrevious()  �Ӻ���ǰ����
	}
}
