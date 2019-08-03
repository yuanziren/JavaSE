package com.javase.day13.app1;

import java.util.Arrays;

/*
 * 数组: 存储多个数据
 * 	1.数组定长
 * 	2.数据类型相同
 * 	3.有序
 * 容器: 存储多个数据
 * 	容器体系:
 * 
 * 自定义简单容器类  : 长度随着增大而扩大,随着减少而减小
 * 只能 存储字符串类型的数据
 */
public class App01 {
	public static void main(String[] args) {
		//1.创建自定义容器类的对象
		MyContainer my=new MyContainer();
		System.out.println(my.size());
		
		//2.  add("护手霜")  添加数据
		my.add("护手霜");
		my.add("爽肤水");
		my.add("全能乳液");
		System.out.println(my.size());
		
		//3.  get(index); 根据索引查询 查询指定索引位置的数据
		System.out.println(my.get(0));
		System.out.println(my.get(1));
		System.out.println(my.get(2));
		
		//4.  delete(index);  删除某个索引位置的数据
		my.delete(1);
		System.out.println(my);
		
		//5.  alter(index,data); 修改某个索引位置的数据
		
		
	}
}

//自定义容器类
class MyContainer{
	private String[] arr;  //存储容器中数据的数组
	private int size;  //容器中数据的个数
	
	public MyContainer() {
		arr=new String[0];
	}

	/**
	 * 删除方法
	 * @param index 索引
	 */
	public void delete(int index) {
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException("索引越界"+index);
		}
		//1.备份原数组
		String[] temp=arr;
		//2.创建新数组
		arr=new String[size-1];
		//3.遍历拷贝
		for(int i=0;i<size;i++){
			if(i<index){
				arr[i]=temp[i];
			}else if(i==index){
				continue;
			}else{
				arr[i-1]=temp[i];
			}
		}
		size--;
	}

	/**
	 * 添加功能
	 * @param value  参数需要添加的数据
	 */
	public void add(String value) {
		//备份原数组
		String[] temp=arr;  
		//扩容后的新数组
		arr=new String[size+1];
		//拷贝  从原数组中拿出数据放到新数组中
		for(int i=0;i<size;i++){
			arr[i]=temp[i];
		}
		//在新数组的最后赋值添加数据
		arr[size]=value;
		size++;
	}
	
	/**
	 * 获取方法
	 * index : 索引
	 */
	public String get(int index){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException("索引越界"+index);
		}
		return arr[index];
	}
	
	//获取长度
	public int size(){
		return this.size;
	}

	@Override
	public String toString() {
		return "MyContainer [arr=" + Arrays.toString(arr) + ", size=" + size + "]";
	}
	
	
	
}
