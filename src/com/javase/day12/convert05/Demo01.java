package com.javase.day12.convert05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 	乱码:
 * 		编码集:你认识的到计算机认识的  字符-->字节    
 * 		解码集:计算机认识的到你认识的  字节-->字符
 * 
 *  出现乱码的情况:
 *  	1.编码解码格式不同一
 *  	2.长度丢失
 */
public class Demo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//编码
		String str="哈哈"; 
		System.out.println(Arrays.toString(str.getBytes()));  //utf-8
//		System.out.println(new String(str.getBytes("gbk"),"gbk"));
		System.out.println(new String(str.getBytes(),0,2));
		
		/*
		 * ISO-8859-1  1个
		 * GB2312		2个
		 * GBK			2个
		 * UTF-8		3个
		 */
		System.out.println("中".getBytes("ISO-8859-1").length);
		System.out.println("中".getBytes("GB2312").length);
		System.out.println("中".getBytes("GBK").length);
		System.out.println("中".getBytes("UTF-8").length);
		
		
	}
}
