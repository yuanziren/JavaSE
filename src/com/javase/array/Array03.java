package com.javase.array;
/*
 * ʹ������ʱ���õ��쳣
	1.��������Խ���쳣:  ArrayIndexOutOfBoundsException:
					1.����������Χ
					2.��������
	2.��ָ���쳣: NullPointerException
			�����ֵ��ֵΪnull
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
