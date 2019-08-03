package com.javase.day12.byteio02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 文件拷贝
 * 	数据源  ---输入---   程序  ---输出---   目的地
 * 	1.创建流  
 * 		文件输入流
 * 		InputStream is=new FileInputStream("D:/hehe.txt");
 * 		文件输出流
 * 		OutputStream os=new FileOutputStream("E:/hehe.txt");
 *  2.准备卡车 
 *  	byte[] car=new byte[1024];
 *  3.读取+写出
 *  	int len;  //读到数据的个数
 *  	while((len=is.read(car))!=-1){
 *  		os.write(car,0,len);
 *  	}
 *  4.刷出
 *  	os.flush();
 *  5.关闭
 *  	先打开的后关闭
 */
public class CopyFile06 {
	public static void main(String[] args) {
		//1.选择流
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream("D:/hehe.txt");
			os=new FileOutputStream("E:/hehe.txt");
			//2.准备卡车 
			byte[] car=new byte[1024];
			//3.读取+写出
			int len = -1;  //读到数据的个数
			while((len=is.read(car))!=-1){
				os.write(car,0,len);
			}
			//4.刷出
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//关闭   一整块添加try..catch   alt+shift+z
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
