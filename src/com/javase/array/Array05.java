package com.javase.array;
/*
 * 数组练习
 */
public class Array05 {
	public static void main(String[] args){
		int[] arr=new int[]{1,26,0,8,10,50,8,0,7,35,0,4,3,20,0,17};
		int[] arr1=filter(arr);
		for(int i:arr1){
			System.out.println(i);
		}
		System.out.println(arr.length);
		System.out.println(arr1.length);
	}
	
	/*
	 * 1.将一个整型数组中的0去掉后但会一个新数组.
	 * 	例如: int[] arr={1,26,0,8,10,50,8,0,7,35,0,4,3,20,0,17};
	 *  要求:将以上数组中的0去掉,将不为0的值存入一个新数组,生成新的数组作为返回值.
	 *  	int newArr={1,26,8,10,50,8,7,35,4,3,20,17};
	 */
	//返回值:返回数组int   参数:int[]
	public static int[] filter(int[] arr){
		int count=0; //计数器
		//查找不为0数据的个数
		for(int i:arr){
			if(i!=0){
				count++;
			}
		}
		//判断是否存在0
		if(count==arr.length){
			return arr;
		}
		
		//构建新数组  ,根据指定长度
		int[] newArr=new int[count];
		//遍历原数组把数据方法新数组中
		int index=0; //新数组的索引
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]!=0){
				newArr[index]=arr[i];
				index++;
			}
		}
		return newArr;
	}
	
}
