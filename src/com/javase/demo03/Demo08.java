package com.javase.demo03;
/**  
	 ����java��ѭ��Ƕ��
		for(������ʼ��;�����仯;�����ж�){
			//����
			for(������ʼ��;�����仯;�����ж�){
				//����
			}
			//����
		}
*/
public class Demo08{ 
	//��������
	public static void main(String[] args){
		/*
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
		*/
		//����ѭ�� 
		int count=0; //������
		for(int i=1;i<=25;i++){
			System.out.print("*"+" ");
			count++;
			if(count==5){
				System.out.println();
				count=0;
			}
		}
		
		//ѭ��Ƕ��  
		//���ѭ������i��������  ��1��ʼ,  һ����5��
		for(int i=1;i<=5;i++){
			//���ƴ�ӡÿһ���е���������  �ڲ�ѭ����1,һ����ӡ5������
			for(int j=1;j<=5;j++){  
				System.out.print("* ");
			}
			//����
			System.out.println();
		}
		/*
			* * * * * 
			*       *      
			*       * 
			*       * 
			* * * * * 
		*/
		for(int i=1;i<=5;i++){
			//���ƴ�ӡÿһ���е���������  �ڲ�ѭ����1,һ����ӡ5������
			for(int j=1;j<=5;j++){ 
				if(i==1 || i==5 || j==1 || j==5){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			//����
			System.out.println();
		}
		/*
			*   				1	
			* *      			2
			* * *				3
			* * * *				4
			* * * * * 			5
		*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			//����
			System.out.println();
		}
		
		/*
			*   				1	
			* *      			2
			*   *				3
			*     *				4
			* * * * * 			5
		*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if(i==5 || j==1 || j==i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			//����
			System.out.println();
		}
		
		//�žų˷���
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
