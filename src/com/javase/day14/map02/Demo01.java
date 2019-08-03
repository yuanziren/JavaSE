package com.javase.day14.map02;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * 1.使用HashMap存储key为Person类型,value为Integer类型数据,作用根据key和value同时去重
 * 2.TreeMap的key是引用是引用数据类型,想要根据Person的年龄排序  升序
 * 		自定义比较器  Comparator  重写compare
 * 		内部笔比较器  Comparable  重写CompareTo
 * HashMap-->HashSet
 * TreeMap-->TreeSet
 */
public class Demo01 {
	public static void main(String[] args) {
		Map<Person,Integer> map=new HashMap();
		map.put(new Person("张三",18), 1);
		map.put(new Person("张四",19), 2);
		map.put(new Person("张四",19), 2);
		System.out.println(map);
		System.out.println("开始存放新数据,要检测......");
		check(map,new Person("张五",20),2);
		System.out.println(map);
		
		//2.
		TreeMap<Person,Integer> tree=new TreeMap((o1,o2)->{
			return ((Person)o2).age-((Person)o1).age;
		});
		tree.put(new Person("张三",18), 1);
		tree.put(new Person("张四",19), 2);
		tree.put(new Person("张四",17), 2);
		tree.put(new Person("张六",17), 2);
		System.out.println(tree);
	}
	
	//添加时,保证key和value去重问题,如果存在相同的key和value都不允许添加
	public static void check(Map map,Person p,Integer i){
		if(map.containsValue(i)){
			System.out.println("已经存在这个value="+i);
		}else{
			map.put(p, i);
		}
	} 
}



