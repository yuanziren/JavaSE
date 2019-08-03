package com.javase.day12.bytearray06;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组流
 * 	节点流 
 * 	1.源头从文件改为字节数组
 * 	2.不需要关闭
 * 	3.不宜过大
 *	4.任何东西都可以转为字节数组,直接操作内存
 *	字节数组输入流
 *		ByteArrayInputStream
 *	字节数组输出流
 *		ByteArrayOutputStream
 *		新增方法:	 byte[] toByteArray() 创建一个新分配的 byte 数组。 
 *		不能多态使用
 *
 *  程序中的数据--->字节数组
 *  字节数组--->读到程序中
 *  
 *  作业:
 *  文件中--文件数入流-->程序--字节数组输出流-->字节数组
 *  字节数组--字节数组输入流-->程序 --文件输出流-->文件
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		fromByteArray(toByteArray());
	}
	//从字节数组中读取内容
	public static void fromByteArray(byte[] arr) throws IOException{
		//1.选择流
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(arr));
		//2.读
		byte[] car=new byte[1024];
		int len;
		while((len=is.read(car))!=-1){
			System.out.println(new String(car,0,len));
		}
		is.close();
	}
	
	
	//把数据写出到字节数组中
	public static byte[] toByteArray() throws IOException{
		//创建流
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		String str="我是字节数组流,我在一些服务器底层或框架底层都是用,但是你很少能使用我,请了解我,谢谢!!!";
		os.write(str.getBytes());
		byte[] arr=os.toByteArray();
		return arr;
	}
}
