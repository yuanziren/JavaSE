package com.javase.array;
/*
 * 数组排序
	冒泡排序  选择排序
	选择排序效率较高
	
 */
public class ArraySort07 {
	public static void main(String[] args){
		int[] arr={5,2,7,8,3};	
		int[] arr1=bubble(arr);
		//print(choice(arr));
		//print(choice2(arr));
		
		print(arr1);
		//先升序排序   冒泡排序
		System.out.println(search(arr1,7));
		
	}
	/*
		前提:先升序排序
		二分法 查找   找到指定数据在数据中的索引并返回 如果没找到返回-1
	*/
	public static int search(int[] arr,int value){
		//最小范围索引
		int min=0;
		//最大数据的索引
		int max=arr.length-1;
		//中间位置索引
		int mid=(min+max)/2;
		
		while(value!=arr[mid]){
			if(value>arr[mid]){
				min=mid+1;
			}else{
				max=mid-1;
			}
			if(min>max){
				return -1;
			}
			
			mid=(min+max)/2;
		}
		
		return mid;
	}
	
	
	/*
		选择排序:每一轮确定一个主场数据,拿这个数据后它后面的每一个数据去比较,满足条件进行交换,不满足条件不交换
		int[] arr={5,2,7,8,3};
		第一轮: 索引为0位置作为主场   8,2,5,7,3
		第二轮: 索引为1位置作为主场     7,2,5,3
		第三轮: 索引为2位置作为主场       5,2,3
		第三四: 索引为3位置作为主场         3,2
		一共有arr.length个数据,比较  arr.length-1轮   i :0~arr.length-2
	*/
	public static int[] choice(int[] arr){
		//外层循环i控制轮数,每一轮中作为主场数据的索引数
		for(int i=0;i<arr.length-1;i++){
			//与主场数据比较的所有数据的索引变化范围
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i] < arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	/*
		优化版本选择排序:
			每一轮最多只交换一次,找到最小的或者最大的进行交换
			声明一个中间变量,用来存储这一轮中找到的最大的|最小的值的索引
	*/
	public static int[] choice2(int[] arr){
		//外层循环i控制轮数,每一轮中作为主场数据的索引数
		for(int i=0;i<arr.length-1;i++){
			//与主场数据比较的所有数据的索引变化范围
			int max=i;  //假设每一轮作为主场数据都是最大的
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[max] < arr[j]){
					max=j;
				}
			}
			
			if(max!=i){
				int temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
		}
		return arr;
	}
	
	/*
		冒泡排序:每两个数据之间进行比较一次,找出最大的或者最小的进行交换   做升序
		int[] arr={5,2,7,8,3};	
		第一轮: 2,5,7,3,8   比较出最大的数据放在了最后的位置		i=0
		第二轮: 2,5,3,7												i=1
		第三轮: 2,3,5												i=2
		第四轮: 2,3													i=3
		
		这一轮中参与比较数据的个数  arr.length-i
	*/
	public static int[] bubble(int[] arr){
		//外层循环 i控制比较轮数
		for(int i=0;i<arr.length-1;i++){
			//m 每一轮中,每两个数据比较,中前面数据的索引   m,m+1这两个索引位置的数据进行比较
			for(int m=0;m<arr.length-i-1;m++){
				if(arr[m] > arr[m+1]){
					int temp=arr[m];
					arr[m]=arr[m+1];
					arr[m+1]=temp;
				}
			}
		}
		return arr;
	}
	
	
	//遍历int数组
	public static void print(int[] arr){
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
