package com.javase.day13.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  遍历
 *  	增强for   
 *  	迭代器 iterator()
 */
public class Demo02 {
	public static void main(String[] args) {
		//当前容器中只能存储泛型中存储的数据 <String>
		Collection<Integer> c=new ArrayList<Integer>();
		//c.add("haha ");
		Collection<String> col=new ArrayList();  //等号右边的泛型可以省略
		col.add("城野医生");
		col.add("欧莱雅");
		col.add("不用");
		col.add("自来水");
//		col.add(false);
		
		//增强for
		for(Object s:col){
			if(s instanceof String){
				System.out.println(((String) s).length());
			}
		}
		//加过泛型能够确定容器中只有字符串
		for(String str:col){
			System.out.println(str);
		}
		System.out.println("------------");
		//迭代器
		//Iterator<E> iterator() 返回一个能够遍历|迭代当前容器对象的迭代器对象
		Iterator<String> it=col.iterator();
		while(it.hasNext()){  //判断后面是否有元素,如果存在返回true
			System.out.println(it.next().length()); //获取下一个元素
			System.out.println(it.next());
		}
		
		//泛型可以增强程序的稳定性和可读性   
	}
}
