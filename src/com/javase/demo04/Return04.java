package com.javase.demo04;
/**  	
	����java�е�return
		returnʹ�����з���ֵ���͵ķ�����:--�������return
										��������ֵ
										��������
			  ʹ����û�з���ֵ���͵ķ�����:�������� --���Դ��ڿ��Բ�����
		return����Ĵ��벻��ִ��
			���ɴ����:��Զ�޷����ʵ����
		һ�����������ɴ����ļ������:
									1.return����
									2.��ѭ������
									3.һ����ִ�е�break����
									4.һ����ִ�е�continue����
									5.while(false)�е����
		��һ���������������ֵ�returnֻ����һ��
		
	��������
		�βε���������>=ʵ�ε���������
		��������>=����ֵ����>=return�󷵻����ݵ�����
			
*/
public class Return04{ 
	//��������
	public static void main(String[] args){
		//long a=test((byte)15);
		/*
		for(;;){
			
		}
		
		
		while(false){
			System.out.println(5555);
		}
		*/
		
		int area=getArea(5,6);
	}
	
	public static int getArea(int w,int h){
		return w*h;
	}
	
	public static int test(int a){
		if(a==5){
			return -1;
			//return -2;
			//System.out.println(1111);  //�޷����ʵ����
		}
		
		return (byte)a;
	}
	
	
}
