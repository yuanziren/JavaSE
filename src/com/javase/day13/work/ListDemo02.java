package com.javase.day13.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println(list);//[����, ����, ����, ����, ����]
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("����")) {
				list.add("������");//[����, ����, ����, ����, ����, ������]
			}
		}
		System.out.println(list);
		
		/*for (String s : list) {//ConcurrentModificationException
			if (s.equals("����")) {
				list.add("JJBOY");
			}
		}
		System.out.println(list);*/
		
		Iterator it = list.iterator();
		/*while (it.hasNext()) {//ConcurrentModificationException
			if (it.next().equals("����")) {
				list.add("��������");
			}
		}
		System.out.println(list);*/
		ListIterator<String> ls=list.listIterator();
		while(ls.hasNext()){
			if(ls.next().equals("����")){//[����, ����, ����, ����ӳ�, ����, ����, ������]
				ls.add("����ӳ�");
			}
		}
		System.out.println(list);
	}
}
