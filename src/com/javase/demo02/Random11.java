package com.javase.demo02;
/**  
	����java�е�Random��
	Random : ���������
		1.���� java.util.Random
		2.�������͵ı���  Random ran=new Raindom();
		3.����.��������();
			nextInt();  ����int��Χ�ڵ������
			nextInt(����n) [0,n)�������
			
			��ʽ: 
				[0,max] ֮����������
				����.nextInt(max+1);
				[min,max)
				����.nextInt(max-min)+min;
				[min,max]
				����.nextInt(max-min+1)+min;
				
			
			nextDouble(); ����[0.0,1.0)���С��
				
		
*/
import java.util.Random;
public class Random11{ 
	//��������
	public static void main(String[] args){
		//1.����
		//2.�������͵ı���  
		Random ran=new Random();
		//3.����.��������();
		System.out.println(ran.nextInt());
		//[0,5)
		System.out.println(ran.nextInt(5));
		//[0,5]
		System.out.println(ran.nextInt(6));
		//[2,5]     [0,5]+3   [3,8]
		System.out.println(ran.nextInt(3)+2);
		
		System.out.println(ran.nextDouble());
	}
}
