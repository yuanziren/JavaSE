package com.javase.day13.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("陈七");
		System.out.println(list);//[张三, 李四, 王五, 赵六, 陈七]
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("陈七")) {
				list.add("猪猪侠");//[张三, 李四, 王五, 赵六, 陈七, 猪猪侠]
			}
		}
		System.out.println(list);
		
		/*for (String s : list) {//ConcurrentModificationException
			if (s.equals("赵六")) {
				list.add("JJBOY");
			}
		}
		System.out.println(list);*/
		
		Iterator it = list.iterator();
		/*while (it.hasNext()) {//ConcurrentModificationException
			if (it.next().equals("王五")) {
				list.add("王五老婆");
			}
		}
		System.out.println(list);*/
		ListIterator<String> ls=list.listIterator();
		while(ls.hasNext()){
			if(ls.next().equals("王五")){//[张三, 李四, 王五, 惊奇队长, 赵六, 陈七, 猪猪侠]
				ls.add("惊奇队长");
			}
		}
		System.out.println(list);
	}
}
