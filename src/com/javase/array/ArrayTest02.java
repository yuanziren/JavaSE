package com.javase.array;
/*
 * 数组练习1
 */
public class ArrayTest02 {
	public static void main(String[] args){
		int[] arr=new int[3];
		print(arr);
		print(new char[]{'a','b','c'});
		
		getMaxMin(new int[]{5,2,6,4,9,3});
		reversePrint(new int[]{1,2,3,4,5});
	}
	
	//A:遍历int类型的数组 依次输出每个数组元素
	public static void print(int[] arr){
		//普通for :通过遍历的形式往数组中赋值
		/*
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=i+1;
		}
		*/

		for(int i:arr){
			System.out.println(i);
		}
	}
	
	//B:遍历字符数组
	public static void print(char[] arr){
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}
	}
	
	//C:最值:获取数组中的最大值和最小值
	public static void getMaxMin(int[] arr){
		int max=arr[0]; //假设当前数据就是这个数组中的最大值,并且存储最大值
		int min=arr[0]; //假设当前数据就是这个数组中的最小值
		for(int i=0;i<=arr.length-1;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	//D:逆序:倒叙输出数组元素
	public static void reversePrint(int[] arr){
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
	
}
