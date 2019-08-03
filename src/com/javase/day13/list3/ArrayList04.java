package com.javase.day13.list3;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList *****
 * 	底层:可变数组实现,连续的内存空间
 * 		动态扩容:扩容之后的长度是原长度的1.5倍,使用copyOf进行动态扩容,加载因子:1,初始容量为10
 * 	优点:根据索引操作,遍历,快速访问效率高
 * 	缺点:添加,删除效率低
 * 	线程不安全的,效率高
 * 
 * Vector:向量
 * 	与ArrayList几乎一样
 * 	底层数组实现
 * 	动态扩容:扩容后的长度是原长度的2倍
 * 	线程安全的,效率低
 */
public class ArrayList04{
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("哈哈");
		list.add("null1");
		list.add("null2");
		list.add("null3");
		list.add("null4");
		System.out.println(list);
		removeRange(list,2,4);
		System.out.println(list);
		
		/*
		 * protected  void removeRange(int fromIndex, int toIndex) 
          移除列表中索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素。 
		 */
	}

	private static void removeRange(List list,int i, int j) {
		for (i = 0; i < j; i++) {
			
		}
		
	}
}
