package com.javase.day08.modifier;
//����  ����Ȩ�����η�
public class Fu{
	private int p=5;
	int d=10;
	protected int pro=15;
	public int pub=20;
	
	public void test(){
		System.out.println(p+"--->"+d+"--->"+pro+"--->"+pub);
	}
	
	public static void test2(){
		System.out.println("���Ǹ���ľ�̬����������");
	}
	
	public Fu() {
		
	}
}