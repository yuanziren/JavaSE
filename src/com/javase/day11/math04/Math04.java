package com.javase.day11.math04;
/*
 * static double abs(double a) 
          返回 double 值的绝对值。 
 */
public class Math04 {
	public static void main(String[] args) {
		//static double ceil(double a) 向上取整 
		System.out.println(Math.ceil(-3.9));
		
		//static double floor(double a)  向下取整
		System.out.println(Math.floor(-3.3));
		
		/*
		 *  static long max(long a, long b) 
			          返回两个 long 值中较大的一个。 
			static double min(double a, double b) 
			          返回两个 double 值中较小的一个。 
		 */
		System.out.println(Math.max(1.2,2.2));
		System.out.println(Math.min(1.2,2.2));
		
		//static long round(double a)  返回最接近参数的 long。 
		
		//static double random()    返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。 
	}
}
