package com.javase.day09.work01;
//thisָ����ǰnew�Ķ���,˭�������Ҿ�ִ��˭
//�ڹ������в���ͬʱ����,this����ʾ��super��Ҫ�����е��ù���������ͬʱ����,����super������ʽ����
public class Test02 {
	public static void main(String[] args) {
		Zi zi=new Zi();
	}
}

class Fu{
	public Fu() {
		System.out.println("����չ���");
	}
	public Fu(int a) {
		System.out.println("������ι���");
	}
}
class Zi extends Fu{
	public Zi() {
		super();
//		this(3);
//		super(4);
		System.out.println("����չ���");
	}
	
	public Zi(int a) {
		
		System.out.println("������ι���");
	}
}
