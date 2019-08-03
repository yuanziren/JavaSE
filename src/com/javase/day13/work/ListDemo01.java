package com.javase.day13.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//添加
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);//[1, 2, 3, 4]
		//修改
		list.set(1, 666);
		System.out.println(list);//[1, 666, 3, 4]
		//删除
		list.remove(3);//删除指定索引出的数据
		System.out.println(list);//[1, 666, 3]
		//获取
		System.out.println(list.get(2));//3
		
		//遍历
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
