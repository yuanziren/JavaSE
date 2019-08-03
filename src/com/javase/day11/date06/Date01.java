package com.javase.day11.date06;

import java.util.Date;

/*
 * Date日期类
 * 	构造器:
 * 		Date() 以本地时间构建日期对象
 * 		Date(long time) 以参数毫秒数从1970 年 1 月 1 日 00:00:00开始计算
 * 	1.导包java.util.Date	
 * 	2.毫秒数都是以1970 年 1 月 1 日 00:00:00 GMT）为准
 */
public class Date01 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		//System.out.println(date.toString().length());
		
		//long getTime()   返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。 
		System.out.println(date.getTime());
		Date date2=new Date(1551428482079L);
		System.out.println(date2);
		System.out.println(date==date2);
		// boolean equals(Object obj)      比较两个日期的相等性。
		System.out.println(date.equals(date2));  //true
		
		/*
		 * boolean after(Date when) 
		          测试此日期是否在指定日期之后。 
		 boolean before(Date when) 
		          测试此日期是否在指定日期之前。 
		 */
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		
		/*
		 * int compareTo(Date anotherDate)    比较两个日期的顺序。 
		 */
		System.out.println(date.compareTo(date2));  //1
		
		
		//static long currentTimeMillis()       返回以毫秒为单位的当前时间。 
		System.out.println(System.currentTimeMillis());
		System.out.println(date.getTime());
	}
}
