package com.javase.day09.practice;
/*
 * �����Ĵ�ԭ��:
 * 1���̳��� ���Լ�û���Ҹ���
 *   		A
 *   	  /   \
 *   	 B	   C
 * 2�����뿴���ͣ�ȷ���������������Ҷ���  
 * 	��Ա����:���뿴���|����  ���п��ұ�|����
 * 
 * 3���ͽ�����ԭ���Լ�û���Ҹ���
 * 
 * 4����������������������ɼ�
 *   
 * ����ʱȷ��������:��̬�ܹ����õķ���
 *   
 */
public class PolyPractice {
	public static void main(String[] args) {
		//��̬  ���������ָ���������
//		A a=new B();  //"B----test()   B----test(int)  A----test(double)
//		a.test(1.0);// A--double
//		a.test(1);  // B--int
//		a.test('1');// B--ints
		
		A a=new C();   //C----test()  C----test(int)  C----test(double)
		a.test(1.0);//c--double
		a.test(1);//c--int
//		a.test('s');// �������������Ը��಻�ɼ�
	}
}
class A{
	public void test(){
		System.out.println("A----test()");
	}
	public void test(int a){
		System.out.println("A----test(int)");
	}
	public void test(double a){
		System.out.println("A----test(double)");
	}
}
//û����������,�Ը������з���������д
class C extends A{
	public void test(){
		System.out.println("C----test()");
	}
	public void test(double a){
		System.out.println("C----test(double)");
	}
	public void test(int a){
		System.out.println("C----test(int)");
	}
}
class B extends A{
	public void test(){
		System.out.println("B----test()");
	}
	public void test(int a){
		System.out.println("B----test(int)");
	}
	//���������Ը������ò��ɼ�
	public void test(char a){
		System.out.println("B----test(char)");
	}
}