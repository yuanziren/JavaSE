package com.javase.day12.byteio02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 每次写出一个字节内容,先要优化,写出多个字节,一卡车内容 byte[]
 */
public class IODemo05 {
	public static void main(String[] args){
		//1.建立联系   File 目的地 
		//2.选择流
		OutputStream os=null;
		try { 
			//写出的目的地文件如果不存在,系统会自动帮你创建,如果路径不存在,不会为你自动创建
			os=new FileOutputStream("D:/haha.txt",true);
			//3.操作写出
			//准备数据
			String str="原来是爱情啊!!!!";
			byte[] car=str.getBytes();
			os.write(car);
			//4.强制刷出
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//5.关闭
			try {
				if(os!=null){
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
