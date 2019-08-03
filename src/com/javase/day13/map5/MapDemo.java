package com.javase.day13.map5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
 * Map ��ֵ����ʽ������
 * 	�����,�����ظ�
 * 	��ֵ��   key->value  һ����ֻ�ܶ�Ӧһ��ֵ,һ��ӳ���ϵ
 * 	keyֵ�����Ƿ�����ظ�
 *  ���key��ͬ,value����
 * 	HashMap��key����HashSet
 * 	TreeMap��keyά��TreeSet
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap();
		//������
		map.put(1, "�Ǻ�");
		map.put(3, "�Ǻ�");
		map.put(1, "����");
		map.put(4, "�Ǻ�");
		//��ȡ
		System.out.println(map.get(3));
		/**
		 * 1.1ͨ��keySet()����
		 */
		//keySet()
		Set<Integer> set=map.keySet();
		System.out.println(set);
		for (Integer i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
		/**
		 * 1.2ͨ��map.values()����
		 */
		for (String s : map.values()) {
			System.out.print(s+" ");
		}
		System.out.println();
		/**
		 * 2.ͨ��map.entrySet().iterator()����
		 */
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Entry<Integer, String> entry = entries.next();
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key+":"+value);
		}
		/**
		 * 3.ͨ��map.keySet().iterator()����
		 */
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + " --->" + value);
		}
		/**
		 * 4.map.entrySet()����
		 */
		for(Entry<Integer, String> entry : map.entrySet()){
		    Integer mapKey = entry.getKey();
		    String mapValue = entry.getValue();
		    System.out.println(mapKey+":"+mapValue);
		}
		
		System.out.println();
		//ɾ��
		System.out.println(map.remove(4));
		System.out.println(set);
		System.out.println(map);
		
		//values()
		Collection col=map.values();
		System.out.println(col);
	}
}
