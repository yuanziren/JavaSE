package com.javase.demo03;
/**  
	 ����java�е�Math.random()
	 
	 Math��java�ṩ��һ����ѧ��
		����Ҫ����,��java.lang����
	
	 ��ȡ����� Math.random() [0.0,1.0)�����
	 ��ȡĳ����Χ�ڵ������  [0,max)
		Math.random()*max
	 ��ȡĳ����Χ�ڵ������  [0,max] (maxֵ��С���ܹ�ȡ��)
		Math.random()*(max+1)
	 ��ȡĳ����Χ�ڵ��������  [0,max] 
		(int)(Math.random()*(max+1))
	 ��ȡĳ����Χ�ڵ��������  [min,max]   [3,5]
		(int)(Math.random()*(max-min+1))+min
		
	 Math.round(��ֵ)  ��������,ֻ��עС�����һλ
	 Math.sqrt(��ֵ) ȡƽ����  �����double����
	 Math.abs(��ֵ) ����ֵ 
	
*/
public class Demo02{ 
	//��������
	public static void main(String[] args){
		String str="";
		System.out.println();
		
		//[1,100]
		int num=(int)(Math.random()*(100-1+1)+1);
		
		System.out.println(Math.round(4.49));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.abs(-2));
	}
}
