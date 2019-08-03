package com.javase.day12.buffered04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 *  字节流InputStream OutputStream,字符流Reader,Writer  -->节点流
 *  节点流:数据源到目的地之间直接传输
 *  功能流:增强功能,提高性能,没有实质性的作用，在节点流之上
 *  
 *  缓冲流(节点流)
 *  字节缓冲流:BufferedInputStream,BufferedOutputStream
 *  无新增方法,可以多态调用
 *  字符缓冲流:BufferedReader,BufferedWriter
 */
public class Demo01 {
	public static void main(String[] args) {
		//1.选择流
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new BufferedInputStream(new FileInputStream("D:/haha.txt"));
			os=new BufferedOutputStream(new FileOutputStream("D:/houhou.txt"));
			//2.操作
			byte[] car=new byte[1024];
			int len;
			while((len=is.read(car))!=-1){
				os.write(car, 0, len);
			}
			//3.刷出
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//关闭
				if(os!=null){
					os.close();
				}
				if(is!=null){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
