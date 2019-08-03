package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * IO:包,提供了一些读写IO方面的 操作
 * 	需求:读写文件内部的东西
 * 	流:一连串流动的数据 管道  数据先入先出
 *  数据源头   数据     目的地
 *  以程序为中心   
 *  	输入: 数据源到程序
 *  	输出: 程序到目的地
 *  
 *  流的分类:
 *  	功能分:
 *  		节点流
 *  		功能流
 *  	操作单元:
 *  		字节流
 *  		字符流
 *  	流向分:
 *  		输入流
 *  		输出流
 *  	分类中是相辅相成,互不冲突
 *  
 *  字节流  ---*****
 *  	InputStream  操作单元:字节流    功能分:节点流    流向分:输入流
 *  public abstract class InputStream 
 *  	extends Object 
 *  	implements Closeable
 *  此抽象类是表示字节输入流的所有类的超类。
	FileInputStream 从文件系统中的某个文件中获得输入字节
 *  
 */
public class IODemo01 {
	public static void main(String[] args) throws IOException {
		//FileInputStream(File file) 
		File file=new File("D:/hehe.txt");
		//选择流
		//InputStream is=new FileInputStream(file);
		//FileInputStream(String name)  内部要先构建file对象
		InputStream is=new FileInputStream("D:/hehe.txt");
		//读入操作
		// int read()  从此输入流中读取一个数据字节。 
		int num=is.read();
		System.out.println((char)num);
		//继续再读一个字节
		num=is.read();
		System.out.println((char)num);
		
		num=is.read();
		System.out.println((char)num);

		//关闭
		is.close();
	}
}
