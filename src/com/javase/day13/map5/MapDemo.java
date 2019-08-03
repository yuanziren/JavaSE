package com.javase.day13.map5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
 * Map 键值对形式的数据
 * 	无序的,不可重复
 * 	键值对   key->value  一个键只能对应一个值,一种映射关系
 * 	key值决定是否可以重复
 *  如果key相同,value覆盖
 * 	HashMap的key就是HashSet
 * 	TreeMap的key维护TreeSet
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap();
		//放数据
		map.put(1, "呵呵");
		map.put(3, "呵呵");
		map.put(1, "哈哈");
		map.put(4, "呵呵");
		//获取
		System.out.println(map.get(3));
		/**
		 * 1.1通过keySet()遍历
		 */
		//keySet()
		Set<Integer> set=map.keySet();
		System.out.println(set);
		for (Integer i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
		/**
		 * 1.2通过map.values()遍历
		 */
		for (String s : map.values()) {
			System.out.print(s+" ");
		}
		System.out.println();
		/**
		 * 2.通过map.entrySet().iterator()遍历
		 */
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Entry<Integer, String> entry = entries.next();
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key+":"+value);
		}
		/**
		 * 3.通过map.keySet().iterator()遍历
		 */
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + " --->" + value);
		}
		/**
		 * 4.map.entrySet()遍历
		 */
		for(Entry<Integer, String> entry : map.entrySet()){
		    Integer mapKey = entry.getKey();
		    String mapValue = entry.getValue();
		    System.out.println(mapKey+":"+mapValue);
		}
		
		System.out.println();
		//删除
		System.out.println(map.remove(4));
		System.out.println(set);
		System.out.println(map);
		
		//values()
		Collection col=map.values();
		System.out.println(col);
	}
}
