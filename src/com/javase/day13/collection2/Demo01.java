package com.javase.day13.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * Collection 容器体系的父接口  只能存储单个数据
 * 	 部分允许可重复数据List,部分不允许Set
 *  容器只能存储引用数据类型的数据,基本数据类型自动装箱
 *  容器可以存储任意类型的数据
 */
public class Demo01 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		Collection col2=new ArrayList();
		
		//添加
		col.add("哈哈");
		col.add("哈哈");
		col2.add(123);
		col2.add(456);
		col.addAll(col2);
		
		System.out.println(col);
		
		//删除
		col.remove("哈哈");
		//col.removeAll(col2);
		System.out.println(col);
		
		//清空 clear
		//col2.clear();
		System.out.println(col2);
		
		//包含
		System.out.println(col.contains("哈哈"));
		System.out.println(col.containsAll(col2));
		
		//判断是否为空
		System.out.println(col.isEmpty());
		
		//size
		System.out.println(col.size());
		
		//求交集
		System.out.println(col);
		System.out.println(col2);
		//System.out.println(col.retainAll(col2));//求col和col2的交集，保留将交集保留给col
		System.out.println(col);
		System.out.println(col2);
		
		//专属组
		Object[] obj=col.toArray();
		System.out.println(Arrays.toString(obj));
		
	}
}
