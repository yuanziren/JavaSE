package com.javase.day12.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/hehe.txt");
		File file2 = new File("D:/lala.txt");
		InputStream in = new FileInputStream(file);
		/*int num = in.read();
		System.out.println((char)num);*/
		//==================================
		/*int num = -1;
		while((num=in.read())!=-1){
			System.out.print((char)num);
		}*/
		//==================================
		/*byte[] car = new byte[1024];
		int len = in.read(car);
		System.out.println(new String(car,0,len));*/
		//==================================
		/*OutputStream out = new FileOutputStream(file2,true);
		byte[] car = new byte[1024];
		int len = -1;
		while((len=in.read(car))!=-1) {
			out.write(car);
		}*/
		//==================================
		/*byte[] car = "wertyuiopgfh".getBytes();
		System.out.println(new String(car));
		OutputStream out = new FileOutputStream(file2,true);
		out.write(car);
		out.flush();*/
		//==================================
		in.close();
//		out.close();
		
	}
}
