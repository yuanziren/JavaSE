package com.javase.day12.others07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 基本数据类型流+String  :功能流   字节流
 * 	DataInputStream()
 * 	DataOutputStream()
 * 	有新增方法:
 * 		readXxx()  读入数据类型的数据
 * 		writeXxx() 写出带有数据类型的数据
 * 
 *  对象流  :写出读入对象类型的数据
 */
public class DataDemo01 {
	public static void main(String[] args) throws IOException {
		write("D:/qqq.txt");
		read("D:/qqq.txt");
		
	}
	
	//读取基本数据类型的数据
	public static void read(String src) throws IOException{
		//输入流
		DataInputStream is=new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		//读取数据   写出顺序和读入顺序必须一致
		int i=is.readInt();
		boolean b=is.readBoolean();
		String str=is.readUTF();
		System.out.println(i+","+b+","+str);
		//关闭
		is.close();
	}
	
	//把基本数据类型的数据写出到文件
	public static void write(String dest) throws IOException{
		//输出流
		DataOutputStream os=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		
		//准备数据
		int i=121;
		boolean b=false;
		String str="品如";
		//写出带有数据类型
		os.writeInt(i);
		os.writeBoolean(b);
		os.writeUTF(str);
		
		//刷出
		os.flush();
		//关闭
		os.close();
	}
}
