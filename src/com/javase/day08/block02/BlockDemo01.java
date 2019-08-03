package com.javase.day08.block02;
/*
 * ��  block {}
 * 	1.{}�����ڷ�����,�ֲ������|��ͨ���� 			ִ��ʱ��:���÷���
 *  2.{}���������з�����,�����					ִ��ʱ��:��������
 *  3.static{}���������з�����,��̬��				ִ��ʱ��:����ص�ʱ��
 *  
 *  ע��:��������ڹ�����ִ��,������ڶ�������,���ϵ���һ��ִ��
 *  	��̬���ڵ�һ������ص�ʱ��ֻ��ʼ��һ��,����main����ִ��,������ڶ����̬��,���ϵ���һ��ִ��
 *  
 *  ִ��˳��:��̬��  --- main---�����---������
 */
public class BlockDemo01 {
	static int i=5;
	
	public static void main(String[] args) {
		System.out.println("����������");
		//int i=7;
		//�ֲ������
		{
			i=10;	
			System.out.println(i);
		}
		
		System.out.println(i);  //10	
		
		BlockDemo01 bd=new BlockDemo01();
		bd.test();
	}
	
	//���ٸ��Ƶ�ǰ�е���һ��"ctrl+alt+�����¼�
	static{
		System.out.println("���Ǿ�̬��1");
	}
	static{
		System.out.println("���Ǿ�̬��2");
	}
	
	//�չ���
	public BlockDemo01() {
		System.out.println("�չ���");
	}
	
	//�����
	{
		int a=5;
		System.out.println("���ǹ����1");
	}
	
	{
		System.out.println("���ǹ����2");
	}
	
	
	
	void test(){
		System.out.println(i);
	}
}
