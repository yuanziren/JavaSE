package com.javase.array;
/*
 * ����Java�еĶ�ά����
	������Ƕ������
	
	��ά���������:
		��������[][] ������; --�Ƽ�ʹ��
		�������� ������[][];
		��������[] ������[];
		
	��ά����Ĵ���:
		��������[][] ������=new ��������[һά�ĳ���][��ά�ĳ���];
		��������[][] ������=new ��������[һά�ĳ���][];
			������[һά������]=new ��������[��ά�ĳ���];  --����һά����ķ�ʽ������
		��������[][] ������=new ��������[][]{{1,2},{1,2,3},{1},{1,2,3,4}};
		
	��ά����ı���:
		˫��forѭ��
 */
public class Array04 {
	public static void main(String[] args){
		
		int[][] arr=new int[3][2];
		System.out.println(arr[2][0]);
		
		String[][] arr2=new String[3][];
		arr2[0]=new String[]{"��","��"};
		arr2[1]=new String[]{"��","��","С","��","��"};
		arr2[2]=new String[]{"С","��","��"};
		//arr2[1]={"��","��","С","��","��"};  ����д��������
		System.out.println(arr2[1][3]);
		
		int[][] arr3=new int[][]{{1,2},{1,2,3},{1},{1,2,3,4}};
		System.out.println(arr3[1][0]);
		
		int[][] arr4={{1,2},{1,2,3},{1},{1,2,3,4}};
		System.out.println(arr4[3][3]);
		
		//��ͨfor������ά����  
		//���ѭ������i�����һά���������
		for(int i=0;i<=arr4.length-1;i++){
			//int[] newarr=arr4[i];
			/*
			for(int j=0;j<=arr4[i].length-1;j++){
				System.out.println(arr4[i][j]);
			}
			*/
			for(int a:arr4[i]){
				System.out.println(a);
			}
		}
		
		//��ǿ  //���forѭ��������ά�����е����һά����
		for(String[] str:arr2){
			for(String s:str){
				System.out.println(s);
			}
		}
		
	}
	
	
}
