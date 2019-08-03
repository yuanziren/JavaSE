package com.javase.day12.byteio02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * ÿ��д��һ���ֽ�����,��Ҫ�Ż�,д������ֽ�,һ�������� byte[]
 */
public class IODemo05 {
	public static void main(String[] args){
		//1.������ϵ   File Ŀ�ĵ� 
		//2.ѡ����
		OutputStream os=null;
		try { 
			//д����Ŀ�ĵ��ļ����������,ϵͳ���Զ����㴴��,���·��������,����Ϊ���Զ�����
			os=new FileOutputStream("D:/haha.txt",true);
			//3.����д��
			//׼������
			String str="ԭ���ǰ��鰡!!!!";
			byte[] car=str.getBytes();
			os.write(car);
			//4.ǿ��ˢ��
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//5.�ر�
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
