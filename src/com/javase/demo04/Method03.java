package com.javase.demo04;
/**  	
		û�з���ֵ���͵ķ���
			���η� void ������([�����б�]){
				���������;
				[return;]
			}
			
			void:û�з���ֵ����˼
			return:��ǰ��������
		
		
		�����ĵ���:ִ�з����еĴ���  ������([�����б�]);  
			�з���ֵ���͵ķ���
				1.��ֵ���� 
					�������� ������ = ������(�����б�);
				2.�������
					System.out.println(������(�����б�));
				3.ֱ�ӵ���
					������([�����б�]); 
			û�з���ֵ�ķ���:
				1.ֱ�ӵ���
		
			
*/
public class Method03{ 
	//��������
	public static void main(String[] args){
		//ֱ�ӵ���
		print();
		print();
		print();
		print();
		print();
		//System.out.println(print());
		
		getSum(6,5);
	
	}
	
	//��ӡ99�˷���
	//����ֵ����:����Ҫ����ֵ����   ����:ô��
	public static void print(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println();
		}
	}
	
	//����ĳ�����䷶Χ�����������ĺ�Ȼ��ֱ�����,Ҫ��,��һ��ֵ����>�ڶ���ֵ
	//����ֵ:����Ҫ    ����:2������  int min,int max
	public static void getSum(int min,int max){
		if(min>max){
			System.out.println("��һ��ֵ����>�ڶ���ֵ");
			return;
		}
		int sum=0;
		for(int i=min;i<=max;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
	
	
}
