package com.javase.demo02;
/**  
	����java�еĸ�ֵ�����
		������ֵ�����
			=
			˫Ŀ�����
			������������ķ���
			���ȼ����
		
		��չ��ֵ�����(������ֵ�����+���������)
			+= -= *= /= %=  a+=1;==>a=a+1
 			�ŵ�:
				���ִ��Ч��
				�Զ���ǿ������ת��
			ȱ��: ��ֱ��
			�Ƽ�ʹ����չ��ֵ�����,��ɱ����Ч��
		
*/
public class Operator04{ 
	//��������
	public static void main(String[] args){
		int result=0; //�ܺ�
		int zhangScore=100;
		int wangScore=98;
		result+=zhangScore;//result=result+zhangScore;
		result+=wangScore;//result=result+wangScore;
		
		//�Զ���ǿ������׼��
		short s=1;
		//s=s+1;
		s=(short)(s+1);
		s+=1; //s=s+1
		System.out.println(s);
	}
}
