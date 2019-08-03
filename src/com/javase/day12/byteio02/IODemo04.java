package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 从程序中写出到文件里面数据  
 * 输出流 OutputStream   流向:输出流   功能:节点流	操作单元:字节流
 * public abstract class OutputStream
 * extends Object
 * implements Closeable, Flushable
 * 此抽象类是表示输出字节流的所有类的超类
   FileOutputStream 文件输出流是用于将数据写入 File
       默认写出的时候回覆盖源文件中内容,如果想要追加流的构造器,第二个参数boolean类型值,控制是否追加,true追加,false默认不追加
 */
public class IODemo04 {
	public static void main(String[] args) throws IOException {
		//1.建立联系   File 目的地 
		File file=new File("D:/hehe.txt");
		//2.选择流
		//FileOutputStream(File file) \ 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
		OutputStream out=new FileOutputStream(file,true);  //导包 ctrl+1
		//3.操作写出
		//void write(int b) 将指定字节写入此文件输出流。 
		out.write(99);
		//4.强制刷出
		out.flush();
		//5.关闭
		out.close();
	}
}
