package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * 每次读取一个字节,多个字节要手动操作太麻烦,为了简化,选择使用循环
 */
public class IODemo02 {
	public static void main(String[] args) throws IOException {
		//选择流
		InputStream is=new FileInputStream("D:/hehe.txt");
		//读入操作
		int num=-1;
		/*while((num=is.read())!=-1){
			System.out.print(num);
		}*/
		while((num=is.read())!=-1){
			System.out.print((char)num);
		}
		//关闭
		is.close();
	}
}
