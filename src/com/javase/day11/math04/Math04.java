package com.javase.day11.math04;
/*
 * static double abs(double a) 
          ���� double ֵ�ľ���ֵ�� 
 */
public class Math04 {
	public static void main(String[] args) {
		//static double ceil(double a) ����ȡ�� 
		System.out.println(Math.ceil(-3.9));
		
		//static double floor(double a)  ����ȡ��
		System.out.println(Math.floor(-3.3));
		
		/*
		 *  static long max(long a, long b) 
			          �������� long ֵ�нϴ��һ���� 
			static double min(double a, double b) 
			          �������� double ֵ�н�С��һ���� 
		 */
		System.out.println(Math.max(1.2,2.2));
		System.out.println(Math.min(1.2,2.2));
		
		//static long round(double a)  ������ӽ������� long�� 
		
		//static double random()    ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0�� 
	}
}
