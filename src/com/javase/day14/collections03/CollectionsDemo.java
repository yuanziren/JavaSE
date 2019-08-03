package com.javase.day14.collections03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * Collections 操作容器工具类
 * 	void sort(List) //对 List 容器内的元素排序,按照升序进行排序。
	void shuffle(List) //对 List 容器内的元素进行随机排列
	void reverse(List) //对 List 容器内的元素进行逆续排列
	void fill(List, Object) //用一个特定的对象重写整个 List 容器
	int binarySearch(List, Object)//采用折半查找的方法查找特定对象

 */
public class CollectionsDemo {
	public static void main(String[] args) {
		Person[] p=new Person[3];
		p[0]=new Person("张三",18);
		p[1]=new Person("张四",19);
		p[2]=new Person("张五",17);
		System.out.println(Arrays.toString(p));
		Arrays.sort(p);
		System.out.println(Arrays.toString(p));
		
		List<Person> list=new ArrayList();
		list.add(new Person("张三",18));
		list.add(new Person("张四",19));
		list.add(new Person("张五",17));
		System.out.println(list);
		
		//1.排序
		Collections.sort(list,new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				return ((Person)o1).age-((Person)o2).age;
			}
			
		});
		System.out.println(list);
		
		//2.随机
		Collections.shuffle(list);
		System.out.println(list);
//		
//		//3.操作原容器  反转
		Collections.reverse(list);
		System.out.println(list);
		
		//4.填充
//		Collections.fill(list, null);//NullPointerException
//		System.out.println(list);
		
		//5.二分法查找
		System.out.println(Collections.binarySearch(list, new Person("张四",19)));
	}
}
