package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyUtils {
	//拷贝的功能
	public static void copyFile(String src,String dest){
		copyFile(new File(src),new File(dest));
	}
	
	public static void copyFile(File src,File dest){
		//1.选择流
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream(src);
			os=new FileOutputStream(dest);
			//2.准备卡车 
			byte[] car=new byte[1024];
			//3.读取+写出
			int len;  //读到数据的个数
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
