package com.javase.day13.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		Collection col2 = new ArrayList();
		//添加
		col.add("张三");
		col.add("李四");
		col.add(3);
		col.add(3);
		col.add("赵六");
		col.add("赵六");
		col2.addAll(col);
		System.out.println(col);//[张三, 李四, 3, 3, 赵六, 赵六]
		//修改
		System.out.println("没有修改的方法");
		//删除
		col.remove("赵六");
		System.out.println(col);//[张三, 李四, 3, 3, 赵六]
		/*col.removeAll(col);
		System.out.println(col);//[]*/		
		System.out.println(col2);//[张三, 李四, 3, 3, 赵六, 赵六]
		//包含
		col2.add("陈七");
		System.out.println(col2.containsAll(col));//true
		//是否为空
		System.out.println(col2.isEmpty());//false
		//清空
//		col.clear();
		System.out.println(col);//[张三, 李四, 3, 3, 赵六]
		//求长度
		System.out.println(col.size());//5
		//求交集
		System.out.println(col);//[张三, 李四, 3, 3, 赵六]
		System.out.println(col2);//[张三, 李四, 3, 3, 赵六, 赵六, 陈七]
		System.out.println(col.retainAll(col2));//false
		System.out.println(col2.retainAll(col));//true
		System.out.println(col);
		System.out.println(col2);
		//专属组
		Object[] o = col.toArray();
		System.out.println(o);//[Ljava.lang.Object;@15db9742
		System.out.println(Arrays.toString(o));//[张三, 李四, 3, 3, 赵六]
	}
}
