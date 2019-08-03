package com.javase.day11.date06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  SimpleDateFormat 格式类
 *  y 年
 *  M 月
 *  d 日
 *  H 24小时
 *  h 12小时
 *  m 分
 *  s 秒
 *  S 毫秒
 *  
 *  1.format 日期对象转字符串,指定格式转换 
 *  2.parse 字符串转日期对象
 *  1s=1000ms
 */
public class SimpleDateFormat02 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(); //根据空构造创建对象,默认转换格式
		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss"); //根据空构造创建对象,默认转换格式
		//日期对象转为字符串
		System.out.println(simpleDateFormat2.format(new Date()));;
		//字符串转为日期对象
		String str="2019/03/28 星期四  16:39:06";
		SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("yyyy/MM/dd E HH:mm:ss");
		System.out.println(simpleDateFormat3.parse(str).getTime());
		
	}
}
