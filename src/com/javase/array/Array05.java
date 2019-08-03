package com.javase.array;
/*
 * ������ϰ
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
	 * 1.��һ�����������е�0ȥ���󵫻�һ��������.
	 * 	����: int[] arr={1,26,0,8,10,50,8,0,7,35,0,4,3,20,0,17};
	 *  Ҫ��:�����������е�0ȥ��,����Ϊ0��ֵ����һ��������,�����µ�������Ϊ����ֵ.
	 *  	int newArr={1,26,8,10,50,8,7,35,4,3,20,17};
	 */
	//����ֵ:��������int   ����:int[]
	public static int[] filter(int[] arr){
		int count=0; //������
		//���Ҳ�Ϊ0���ݵĸ���
		for(int i:arr){
			if(i!=0){
				count++;
			}
		}
		//�ж��Ƿ����0
		if(count==arr.length){
			return arr;
		}
		
		//����������  ,����ָ������
		int[] newArr=new int[count];
		//����ԭ��������ݷ�����������
		int index=0; //�����������
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]!=0){
				newArr[index]=arr[i];
				index++;
			}
		}
		return newArr;
	}
	
}
