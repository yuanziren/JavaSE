package com.javase.day12.convert05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * 转换流 : 字节流转字符流
 * 	InputStreamReader    
 * 	OutputStreamWriter    
 * 	没有新增方法,可以发生多态
 */
public class Demo02 {
	public static void main(String[] args) throws IOException {
		//选择流
		BufferedReader read=null;
		BufferedWriter write=null;
		read=new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream("D:/hehe.txt"))));
		write=new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("D:/aaaa.txt"))));
		//读写
		write.write(read.readLine());
		//刷出
		write.flush();
		//关闭
		write.close();
		read.close();
	}
}
