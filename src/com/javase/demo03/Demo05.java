package com.javase.demo03;
/**  
	 whileѭ�� ����ѭ��
	 
	 �����ṹ:
	 
	 ������ʼ��;
	 while(�����ж�){
		 ѭ�������;
		 �����仯;
	 }
*/
public class Demo05{ 
	//��������
	public static void main(String[] args){
		//��ӡ1~100֮�����
		int i=1;  //������ʼ��;
		while(i<=100){
			System.out.println(i);
			i++; //�����仯
		}
		
		System.out.println(i);
		
		int j=1;
		int sum=0;
		while(j<5){
			sum+=j;
			j++;
		}
		//ctrl+c ǿ����ֹ�����ִ������������
		System.out.println(sum);
		
		//��ѭ��
		/*
		while(true){
			System.out.println(1111111);
		}
		*/
		
		for(int int1=1;i>0;){
			System.out.println(1111111);
		}
		System.out.println("������ѭ����Ĵ���");
		
	}
}
