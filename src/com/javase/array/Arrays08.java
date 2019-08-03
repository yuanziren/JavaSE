package com.javase.array;
/*
 * Arrays �������鹤����  
	ʹ��:
		1.����
		2.Arrays.������(����);
 */
 //1.����
 import java.util.Arrays;
public class Arrays08 {
	public static void main(String[] args){
		int[] arr={5,2,7,8,3};
		int[] arr2={5,3,7,8,3};
		//1.static String toString(int[] a)  ����ָ���������ݵ��ַ�����ʾ��ʽ�� 
		System.out.println(Arrays.toString(arr));
		
		//2.static boolean equals(int[] a, int[] a2)  �������ָ���� int ������˴���ȣ��򷵻� true�� 
		//�ȱȽϳ���,������ͬ�ٱȽ�����
		System.out.println(Arrays.equals(arr,arr2));
		
		//3.static void sort(int[] a) ��ָ���� int �����鰴��������������� 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//4.static int binarySearch(int[] a, int key) ���ַ�����   ����������������У��򷵻������������������򷵻� (-(�����) - 1)
		System.out.println(Arrays.binarySearch(arr,10));  //-6
		
		String[] arr3={"��Ϊ","����","��ǿ","����","Ф��"};
		//5.static <T> String[] copyOf(T[] original, int newLength) ����ָ�������飬��ȡ���� null ��䣨���б�Ҫ������ʹ��������ָ���ĳ��ȡ� 
		System.out.println(Arrays.toString(Arrays.copyOf(arr3,3)));
		
		//6.static <T> String[]  copyOfRange(T[] original, int from, int to)  ��ָ�������ָ����Χ���Ƶ�һ�������顣  to����λ������ȡ���� 
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr3,1,6)));
		
		boolean[] arr4=new boolean[6];
		System.out.println(Arrays.toString(arr4));
		
		//7.static void fill(boolean[] a, boolean val) ��ָ���� boolean ֵ�����ָ�� boolean �������ÿ��Ԫ�ء� 
		//Arrays.fill(arr4,true);
		//System.out.println(Arrays.toString(arr4));
		
		//8.static void fill(boolean[] a, int fromIndex, int toIndex, boolean val) ��ָ���� boolean ֵ�����ָ�� boolean ������ָ����Χ�е�ÿ��Ԫ�ء� 
		//toIndex����λ������ȡ����
		Arrays.fill(arr4,1,3,true);
		System.out.println(Arrays.toString(arr4));
	}
}
