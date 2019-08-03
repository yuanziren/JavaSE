package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 往list集合中放漫威的英雄人物,如果存在灭霸,添加一个惊奇队长
 */
public class ListDemo02 {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("钢铁侠");
		list.add("雷神");
		list.add("黑寡妇");
		list.add("美队");
		list.add("灭霸");
		list.add("死侍");
		System.out.println(list);
		
		//普通for
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals("灭霸")){
				list.add("惊奇队长");
			}
		}
		System.out.println(list);
		
		//增强for  ConcurrentModificationException
		/*for(String s:list){
			if(s.equals("灭霸")){
				list.add("惊奇队长");
			}
		}*/
		
		/*
		 * 迭代器  oncurrentModificationException  当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。
		 */
		/*Iterator<String> it=list.iterator();
		while(it.hasNext()){
			if(it.next().equals("灭霸")){
				list.add("惊奇队长");
			}
		}*/
		
		/*
		 * ListIterator<E> listIterator()   返回此列表元素的列表迭代器（按适当顺序）。 
		 */
		ListIterator<String> ls=list.listIterator();
		while(ls.hasNext()){
			if(ls.next().equals("灭霸")){
				ls.add("惊奇队长");
			}
		}
		System.out.println(list);
		
		//尝试使用ListIterator的boolean hasPrevious()  从后往前遍历
	}
}
