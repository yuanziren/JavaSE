package com.javase.demo03;
/**  
	 ����java�е�do..whileѭ��
	 ������ʼ��;
	 do{
		 �����;
		 �����仯;
	 }while(�����ж�);
	 
	 do..while�����Ƿ���������������ִ��һ��
	 
	 for  �����ж�
	 while ����ѭ��
	 do..while ����ѭ��,����ִ��һ��
*/
public class Demo06{ 
	//��������
	public static void main(String[] args){
		//1~100֮��ĺ�
		int i=1;
		int sum=0;
		while(i<=100){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
		
		int j=1;
		sum=0;
		do{
			sum+=j;
			j++;
		}while(j<=100);
		System.out.println(sum);
		System.out.println(j);
		
		//ƭһ�±�����
		boolean flag=false;
		while(flag){
			System.out.println("----lalalala--------");
		}
		
		do{
			System.out.println("----lalalala--------");
		}while(false);
	}
}
