package com.javase.array;
/*
 * 使用数组时常用的异常
	1.数组索引越界异常:  ArrayIndexOutOfBoundsException:
					1.索引超出范围
					2.负数索引
	2.空指针异常: NullPointerException
			数组的值赋值为null
 */
public class Array03 {
	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5};
		
		
		/*
		for(int i=0;i<=arr.length;i++){
			arr[i]=i+1;
		}
		*/
		
		//arr=null;
		System.out.println(arr[1]);
	}
	
	
}
