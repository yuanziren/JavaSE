package com.javase.day10.work01;

import java.util.Scanner;

/*
 * ����������
 * 	�ڹ����ﴴ������ 
 * 	�����û����������,����pizza����
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ѡ����Ҫ����������,1�������,2��������");
		int num=sc.nextInt();
		Pizza pizza=null;
		System.out.println("������۸�");
		double price=sc.nextDouble();
		System.out.println("�������С");
		int size=sc.nextInt();
		if(num==1){
			System.out.println("���������.....");
		}else if(num==2){
			System.out.println("������������Ϣ");
			sc.nextLine();  //��������enter����
			String info=sc.nextLine();
			pizza=new SeaPizza("��������",price,size,info);
		}else{
			System.out.println("���껹û�ϼ�.��ӭ�´�Ʒ��...");
		}
		if(pizza!=null){
			pizza.show();
		}
	}
}
