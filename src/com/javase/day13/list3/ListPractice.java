package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add(1,"3");
		System.out.println(list);//[1, 3, 2]
		List<String> list2 = new ArrayList<String>(list);
		System.out.println(list2);//[1, 3, 2]
		list2.addAll(list);
		System.out.println(list2);//[1, 3, 2, 1, 3, 2]
		list.addAll(list2);
		System.out.println(list);//[1, 3, 2, 1, 3, 2, 1, 3, 2]
		list2.remove(2);
		System.out.println(list2);//[1, 3, 1, 3, 2]
		list2.clear();
		System.out.println(list2);
	}
}
