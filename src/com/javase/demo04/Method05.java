package com.javase.demo04;
/**  	
	���Է���������  Overload   ��д
		��ͬһ������,�����������ͬ�ķ�������,��ͬ�Ĳ����б�(����ǩ����ͬ :����ǩ���Ƿ�����Ψһ��ʶ ����ǩ��=������+�����б�)
		
	�������ص�Ҫ��:
		ͬһ����
		���������ͬ�ķ�����
		��ͬ�Ĳ����б�
			�����������Ͳ�ͬ
			�����ĸ�����ͬ
			������˳��ͬ(��ͬ�������͵�˳��ͬ)
			
	���������غͲ����������޹�
	���������غ���û�з���ֵ�����޹�
	���������غͷ���ֵ�����޹�
	���������غ����η��޹�
	
	��������ֻ�ͷ��������в����б����
	
	���ط����ĵ���ֻ�ͷ�������ʱ���ʵ�ξ���
	
	������һ�����з�װ��һ������
	���������ؾ���һ�����ж�̬��һ������
*/
public class Method05{ 
	//��������
	public static void main(String[] args){
		//�������ط���
		getSum(5,7.7);
	}
	
	
	//��������ĺ�
	public static String getSum(int a,int b){
		System.out.println("������int�Ĳ�����");
		return "";
	}
//	private static int getSum(int a,int b){
//		System.out.println("������int�Ĳ�����");
//		return -1;
//	}
	
	public static void getSum(int a,int b,int c){
		System.out.println("������int�Ĳ�����");
	}
	public static void getSum(double a,double b){
		System.out.println("������double�Ĳ�����");
	}
	public static void getSum(int a,double b){
		System.out.println("���int��double�Ĳ�����");  
	}
	public static void getSum(double b,int a){
		System.out.println("���double��int�Ĳ�����");
	}
	
	//��ӡ�žų˷����ʱ��  99     ָ�����弸�еĳ˷���  print   
}
