package com.javase.day10.work01;
/*
 * instanceof �����  ǰ��λ�ñ���������,����λ�ñ��������� 
 * ����ʱ,ֻ�鿴ǰ������úͺ���������Ƿ���һ���̳�����,���в����������ж�,�Ƿ��Ǻ������͵Ķ��������Ķ���
 */

public class Work01 {
	public static void main(String[] args) {
		String str=new String("abc");
		System.out.println(str instanceof String );
		System.out.println(str instanceof Object );
		
		Zi zi =new Zi();
		System.out.println(zi instanceof Fu);
		System.out.println(zi instanceof Zi);
		Fu fu=new Fu();
		System.out.println(fu instanceof Zi); //false
	}
}

class Fu{}
class Zi extends Fu{}
class Brother extends Fu{}
