package com.javase.demo02;
/**  
	��ϰ
		
*/
public class Practice08{ 
	//��������
	public static void main(String[] args){
		
		System.out.println("=============��ϰ=================");
		int a=10;
		int b=9;
		System.out.println(a>b & ++b>a);  //
		System.out.println("a="+a+",b="+b);  //
		System.out.println("----");
		System.out.println(a<b | b<a);
		System.out.println("----");//
		System.out.println(!(a>b ^ a>9)); //
		//System.out.println(10>5 & 10/0==0); //
		//System.out.println(10>5 && 10/0==0);
		
		//������������ע��
		double d=10/3;  
		a=10/3;
		System.out.println("----");
		System.out.println(a==d);    //
		System.out.println(a);    //
		System.out.println(d);    //
		System.out.println("----");
		
		d=10/3.0;  
		a=10/3;
		System.out.println(a==d);    //
		System.out.println(a);    //
		System.out.println(d);    //
		
		//�Ƚ�2�����Ĵ�С������ֵ
		
		//�Ƚ��������Ĵ�С,������ֵ
	}
}
