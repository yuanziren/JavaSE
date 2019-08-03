package com.javase.day14.map02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Map: 存储键值对数据的容器
 * 	一个key只能有一个value,一一对应的
 * 	put方法存放数据的时候,如果key相同,value会覆盖
 * 
 * HashMap的key如果是引用数据类型,去重为题:重写hashCode()和equals()方法
 * TreeMap的key如果是引用数据类型,排序问题:
 * 
 * HashTable 和 HashMap
 * 	HashTable线程安全的
 *  HashMap 线程不安全
 *  
 * 如何处理HashMap线程不安全问题:
 * 		1.使用HashTable
 * 		2.Collections类中的synchronizedMap(Map<K,V> m) ,返回线程安全的集合
 * 		3.java.util.concurrent 类 ConcurrentHashMap
 */
public class MapDemo01 {
	public static void main(String[] args) {
		/*Map<Integer,List> map=new HashMap();
		List<String> list1=new ArrayList();
		list1.add("汪志静");
		list1.add("静静");
		map.put(3, list1);
//		map.put(4, "lisi");
//		map.put(4, "wangsi");
		System.out.println(map);*/
		
		Map<Person,Integer> map=new HashMap();
		map.put(new Person("张三",18),1);
		map.put(new Person("张三",19),2);
		map.put(new Person("张三",19),2);
		System.out.println(map);
		
		/*for(Person p:map.keySet()){
			System.out.println(map.get(p));
			if(map.get(p)==1){
				map.remove(p);
				map.put(new Person("张三三",18),1);
			}
		}
		System.out.println(map);*/
		
		//遍历方式 3  Map.Entry<K,V>类型  键值对形式 -->对应Map中的键值对数据
		Set<Map.Entry<Person,Integer>> set=map.entrySet();
		for(Map.Entry<Person,Integer> m:set){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}

