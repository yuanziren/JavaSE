package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyUtils {
	//�����Ĺ���
	public static void copyFile(String src,String dest){
		copyFile(new File(src),new File(dest));
	}
	
	public static void copyFile(File src,File dest){
		//1.ѡ����
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream(src);
			os=new FileOutputStream(dest);
			//2.׼������ 
			byte[] car=new byte[1024];
			//3.��ȡ+д��
			int len;  //�������ݵĸ���
			while((len=is.read(car))!=-1){
				os.write(car,0,len);
			}
			//4.ˢ��
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//�ر�   һ�������try..catch   alt+shift+z
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
