package com.javase.array;
/*
 * �ɱ���� 
	1.�ɱ�����ĸ�������û��Ҳ�����ж��,����������������Ҫ����ͬ
	2.�������� ... ������  ...����ɱ����,Ҫд���������ͺͲ�����֮��
	3.�ɱ�����൱���ڷ����ڲ�����һ����ǰ���͵�����,����ʹ�ÿɱ�����е�����Ҫʹ������ķ���
	4.�ɱ����д�ڲ����б�����λ��
 */
public class Parameter06 {
	public static void main(String[] args){
		getSum(1,2,3,4,5,6,7,8,9,10);
	}
	
	//��ͬ������int���Ͳ����ĺ�
	public static void getSum(int ... a){
		int sum=0;
		for(int i:a){
			sum+=i;
		}
		System.out.println(a[2]);
		System.out.println(sum);
	}
	
	public static void test(String a,int ...b){
		
	}
}
