package com.javase.array;
/**  	
	java��һ�ж���ֵ����
			
*/
public class Work01{ 
	//��������
	public static void main(String[] args){
		int i=99;
		
		mb(i);  
		System.out.println(i+100); //199
		
		int[] result=flower();
		for(int a:result){
			System.out.println(a);
		}
		
		System.out.println(fibo(5));
		
	}
	
	//쳲���������  �õ���ָ��λ�õ���
	//����ֵ:���  int    ����:ָ��λ�� int
	public static int fibo(int i){
		if(i==1 || i==2){
			return 1;
		}
		return fibo(i-2)+fibo(i-1);
	}
	
	
	public static int mb(int i){
		i+=100;
		System.out.println(i+100); //299
		return i;
	}
	
	//ˮ�ɻ���  �������ˮ�ɻ�������ˮ�ɻ���  ��������ڷ���-1
	//����ֵ:û�з���ֵ    ����:����Ҫ
	public static int[] flower(){
		int a=0; // ��λ��
		int b=0; // ʮλ��
		int c=0; // ��λ��
		int count=0;
	
		//��ˮ�ɻ����ĸ���
		for(int i=100;i<1000;i++){
			a=i/100;
			b=i%100/10;
			c=i%100%10;
			
			if(i==a*a*a + b*b*b + c*c*c){
				count++;
			}

		}
		//�������ָ��������ˮ�ɻ���
		int[] arr=new int[count];
		
		//��ˮ�ɻ����ó����洢��ָ��������
		int index=0;
		for(int i=100;i<1000;i++){
			a=i/100;
			b=i%100/10;
			c=i%100%10;
			
			if(i==a*a*a + b*b*b + c*c*c){
				arr[index]=i;
				index++;
			}

		}
		return arr;
	}
}
