package com.javase.day12.buffered04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符缓冲流:BufferedReader,BufferedWriter
 * 存在新增方法,不能使用多态,因为父类引用对子类新增方法不可见
 * 	BufferedReader: readLine() 读一行
 *  BufferedWriter: newLine() 换行符
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//选择流
		BufferedReader read=null;
		BufferedWriter write=null;
		try {
			read=new BufferedReader(new FileReader("D:/hehe.txt"));
			write=new BufferedWriter(new FileWriter("D:/ccc.txt"));
			//操作
//			char[] car=new char[1024];
			String str;
			while((str=read.readLine())!=null){
				write.write(str);
				write.write("\r\n");  //系统识别换行
//				write.newLine();
			}
			//刷出
			write.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭
			try {
				if(write!=null){
					write.close();
				}
				if(read!=null){
					read.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
