package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * 每次读取一个字节,效率低,所以选择使用每次读取一卡车一个字节数组的数据
 * 搬家:
 * 目的地,新家			---File
 * 搬家公司			---流
 * 开始搬家
 * 	选择运输工具		---选择卡车字节数组   字节形式数据  
 * 结账				---关闭资源
 * 注意:字节数组的长度指定
 */
public class IODemo03 {
	public static void main(String[] args) throws IOException {
		//选择流
		InputStream is=new FileInputStream("D:/hehe.txt");
		//先创建存储数据的小卡车 字节数组
		byte[] car=new byte[1024];
		//读入操作
		int len=is.read(car);
		System.out.println(new String(car,0,len));
		//关闭
		is.close();
	}
}
