package com.javase.array;
/*
 * ������ϰ1
 */
public class ArrayTest02 {
	public static void main(String[] args){
		int[] arr=new int[3];
		print(arr);
		print(new char[]{'a','b','c'});
		
		getMaxMin(new int[]{5,2,6,4,9,3});
		reversePrint(new int[]{1,2,3,4,5});
	}
	
	//A:����int���͵����� �������ÿ������Ԫ��
	public static void print(int[] arr){
		//��ͨfor :ͨ����������ʽ�������и�ֵ
		/*
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=i+1;
		}
		*/

		for(int i:arr){
			System.out.println(i);
		}
	}
	
	//B:�����ַ�����
	public static void print(char[] arr){
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}
	}
	
	//C:��ֵ:��ȡ�����е����ֵ����Сֵ
	public static void getMaxMin(int[] arr){
		int max=arr[0]; //���赱ǰ���ݾ�����������е����ֵ,���Ҵ洢���ֵ
		int min=arr[0]; //���赱ǰ���ݾ�����������е���Сֵ
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
	
	//D:����:�����������Ԫ��
	public static void reversePrint(int[] arr){
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
	
}
