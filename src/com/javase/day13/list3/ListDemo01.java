package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List接口  
 * 	特点:有序 可重复
 * 	新增了一些操作与索引的方法
 * 
 * 遍历
 * 	1.for..each
 * 	2.普通for  根据索引
 *  3.迭代器
 */
public class ListDemo01 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		//添加
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		list.add(0, 6);
		
		System.out.println(list);
		//删除
		list.remove(0);
		System.out.println(list);
//		list.remove(5);  //当数据与索引类型相同时候,只能识别成为索引
		
		//修改
		list.set(0, 999);
		
		//获取
		System.out.println(list.get(3));
		
		System.out.println(list);
		
		
		/*
		 * 遍历
		 * 	1.for..each
		 * 	2.普通for  根据索引
		 *  3.迭代器
		 */
		//for..each
		for(Integer s:list){
			System.out.print(s + " ");
		}
		System.out.println();
		
		//普通for
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//迭代器
		//1/获取迭代器对象
		
		/*for(Iterator<Integer> it=list.iterator();it.hasNext();){
			System.out.println(it.next());
		}*/
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
}
