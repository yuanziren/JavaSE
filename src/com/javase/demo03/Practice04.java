package com.javase.demo03;
/**  
	 forѭ����ϰ
*/
public class Practice04{ 
	//��������
	public static void main(String[] args){
		//��1-100�ĺ�,��1-100��ż����,��1-100�������� 
		int sum=0; //��1~100֮���
		int sum1=0; //��1~100֮��ż����
		int sum2=0; //��1~100֮��������
		for(int i=1;i<=100;i++){
			sum+=i;
			
			//��ż����
			if(i%2==0){
				sum1+=i;
			}else{
				sum2+=i;
			}
		}
		
		for(int i=0;i<=100;i+=2){
			//���
		}
		System.out.println("1~100֮��ĺ�:"+sum);  //5050
		System.out.println("1~100֮���ż����:"+sum1);  //2550
		System.out.println("1~100֮���������:"+sum2);  //2500
		//1-50�����ܱ�4���������ĺ�
		sum=0; //����
		for(int i=0;i<=50;i++){
			if(i%4==0){
				sum+=i;
			}
		}
		System.out.println("1~50֮���ܱ�4���������ĺ�:"+sum);
		
		sum=0; //����
		sum1=0; //����
		//��� 1-100���м��ܱ�3�������ܱ�5�������ܱ�2�����ĺͣ� 
		for(int i=0;i<=100;i++){
			if(i%2==0 && i%3==0 && i%5==0){
				sum+=i;
			}
			if(i%2==0 || i%3==0 || i%5==0){
				sum1+=i;
			}
		}
		System.out.println(" 1-100���м��ܱ�3�������ܱ�5�������ܱ�2�����ĺ�:"+sum);
		System.out.println(" 1-100�����ܱ�3���������ܱ�5���������ܱ�2�����ĺ�:"+sum1);
		
		//��� 1-100�����ܱ�3���������ܱ�5���������ܱ�2�����ĺ�
		//��5�Ľ׳�  5! 5*4*3*2*1
		int result=1;
		for(int i=5;i>0;i--){
			result*=i; //result=result*i;
		}
		System.out.println(" ��5�Ľ׳�  5! 5*4*3*2*1:"+result);
		
		System.out.println("---------------------------------------------------");
		//���ҳ�[100��300]֮���ܱ�5��������������ÿ�����8����
		int count=0;
		for(int i=100;i<=300;i++){
			if(i%5==0){
				//�ܹ���ȡ����100~300֮���ܱ�5��������
				System.out.print(i+" ");
				count++;  //count=count+1;
				/*if(count%8==0){
					System.out.println(); //����
				}
				*/
				if(count==8){
					System.out.println(); //����
					count=0; //����������
				}
			}
		}

		System.out.println(); 
		System.out.println("---------------------------------------------------");
		count=0;
		//���ҳ�[100��300]֮���ܱ�5��������������ÿ�����8����,ÿ������֮��ʹ�ö��Ž��зָ�,ע��ÿ�����һ�������治��Ҫ����
		for(int i=100;i<=400;i++){
			if(i%5==0){
				if(count==0){
					System.out.print(i);
				}else if(count>=1 && count<=7){
					System.out.print(","+i);
				}
				count++;  //count=count+1;
				if(count==8){
					System.out.println(); //����
					count=0; 
				}
			}
		}
		
		System.out.println();
		
		int a=1;
		int b=10000;
		
		//ʹ��:ʹ���м����
		/*
		int temp=a;
		a=b;  //a=10000  temp=1
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		*/
		
		//�ڶ���:���
		a=a+b;  //a=10001  b=10000
		b=a-b;  //1
		a=a-b;  //10000
		System.out.println(a);
		System.out.println(b);
		
		//������:ʹ��  ^   a^b  
	}
}
