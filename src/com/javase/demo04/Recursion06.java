package com.javase.demo04;
/**  	
	���Է����ݹ�
		�ݹ�:�Լ������Լ�
		
		�ݹ�ͷ:ֹͣ�Լ������Լ�����
		�ݹ���:�Լ������Լ�
		
		�ٽ�����:�ݹ�ͷ
		�ݹ�ǰ����:û�������ٽ�����ʱ,�Լ������Լ�
		�ݹ���˶�:�����ٽ������Ժ�,�ѽ�����ظ���һ��
*/
public class Recursion06{ 
	//��������
	public static void main(String[] args){
		//int result=recursion(5);
		//System.out.println(result);
		
		print(12);
	}
	
	//�� 5�Ľ׳�  ��ĳ�����Ľ׳�   5*4*3*2*1 = 5* recursion(4)
	//����:����ĳ�����Ľ׳�  ����:int n   ����ֵ:��Ҫ����ֵ  int
	public static int recursion(int n){
		//�ٽ�����
		if(n==1){
			return 1;
		}
		//�Լ������Լ�
		return n* recursion(n-1);
	}
	
	//��:�žų˷���   ��ĳ���ĳ˷���
	//����:��ĳ���ĳ˷���    ���� :Ҫ,�������ǲ��� int i   ����ֵ:����Ҫ
	//�ݹ�:�ٽ�����:i=1   1*1=1;
	public static void print(int i){
		//�ٽ�����
		if(i==1){
			System.out.println("1*1=1");
			return;
		}
		print(i-1);
		//��ӡ��ǰ�д���
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+j*i+"\t");
		}
		System.out.println();  //��һ�д�ӡ���֮����
	}
	
}
