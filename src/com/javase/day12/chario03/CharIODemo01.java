package com.javase.day12.chario03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 字符流
 * 	操作纯文本的内容
 *  字符输入流
 *  	Reader  用于读取字符流的抽象类    FileReader,没有新增方法,多态
 *  			read()    read(char[])   +close()
 *  字符输出流
 *  	Writer   FileWriter
 *  			write()  write(char[]) write(char,index,len) write(String) + append(char|String)+flush()+close()
 *
 *	字符流文件拷贝
 */
public class CharIODemo01 {
	public static void main(String[] args) {
		//选择流
		Reader read=null;
		Writer write=null;
		try {
			read=new FileReader("D:/hehe.txt");
			write=new FileWriter("E:/lalala.txt",true);  //true追加
			//读取操作
			/*int num=read.read();
			System.out.println((char)num);
			num=read.read();
			System.out.println((char)num);*/
			//字符数组 
			char[] car=new char[1024];
			int len;
			while(-1!=(len=read.read(car))){
				System.out.println(new String(car,0,len));
//				System.out.println(car);
//				write.write(car);
				
				//写出
			/*	write.write("哈哈哈哈哈哈");
				write.write(97);
				write.write(car,0,len);
				
				write.append('q');
				write.append("呵呵呵呵呵额");*/
				
			}
			//刷出
			write.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
